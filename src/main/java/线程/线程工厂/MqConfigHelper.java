package 线程.线程工厂;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: 范子祺
 **/
public class MqConfigHelper {


    /**
     * 构造ConnectionFactory用的线程池,一个服务建议只构造一个
     *
     * @param threadPoolSize：线程池大小，建议为该服务ConnectionFactory实例数
     */
    public static ExecutorService buildConnectionFactoryExecutor(Integer threadPoolSize) {
        MqThreadFactory threadFactory = new MqThreadFactory();

        return Executors.newFixedThreadPool(threadPoolSize, threadFactory);
    }

    /**
     * 通过命名区分mq线程池，方便排查问题
     * 如需自行构造mq线程池请使用此ThreadFactory
     */
    static class MqThreadFactory implements ThreadFactory {
        private static final AtomicInteger poolNumber = new AtomicInteger(1);
        private final ThreadGroup group;
        private final AtomicInteger threadNumber = new AtomicInteger(1);
        private final String namePrefix;

        MqThreadFactory() {
            SecurityManager s = System.getSecurityManager();
            group = (s != null) ? s.getThreadGroup() :
                    Thread.currentThread().getThreadGroup();
            namePrefix = "QqConnectionFactoryExecutor-" +
                    poolNumber.getAndIncrement() +
                    "-thread-";
        }

        public Thread newThread(Runnable r) {
            Thread t = new Thread(group, r,
                    namePrefix + threadNumber.getAndIncrement(),
                    0);
            if (t.isDaemon())
                t.setDaemon(false);
            if (t.getPriority() != Thread.NORM_PRIORITY)
                t.setPriority(Thread.NORM_PRIORITY);
            return t;
        }
    }

}
