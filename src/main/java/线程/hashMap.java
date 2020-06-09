package 线程;

import org.junit.Test;

import java.util.HashMap;
import java.util.UUID;

/**
 * @description:
 * @author: 范子祺
 **/
public class hashMap {
    final HashMap<String, String> map = new HashMap<String, String>(2);

    Thread t = new Thread(new Runnable() {

        @Override

        public void run() {

            for (int i = 0; i < 10000; i++) {

                new Thread(new Runnable() {

                    @Override

                    public void run() {

                        map.put(UUID.randomUUID().toString(), "");

                    }

                }, "ftf" + i).start();

            }

        }

    }, "ftf");

    @Test
    public void test() throws InterruptedException {
        t.start();

        t.join();
    }

}
