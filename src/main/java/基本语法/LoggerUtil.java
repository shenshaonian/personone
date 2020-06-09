//package 基本语法;
//
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//
///**
// * @description:
// * @author: 范子祺
// **/
//public class LoggerUtil {
//    /**
//     * fqcn
//     */
//    private static final String fqcn = LoggerUtil.class.getName();
//    /**
//     * NOT_AVAIL
//     */
//    private static final String NOT_AVAIL = "?";
//
//    /**
//     * 获取最原始被调用的堆栈信息
//     *
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)
//     * </p>
//     *
//     * @param stackTrace
//     * @return
//     * @author 252956
//     * @date 2017-2-8上午10:33:00
//     */
//    private static StackTraceElement getStackTraceElement(
//            final StackTraceElement[] stackTrace) {
//        boolean next = false;
//        for (final StackTraceElement element : stackTrace) {
//            final String className = element.getClassName();
//            if (next && !fqcn.equals(className)) {
//                return element;
//            }
//            if (fqcn.equals(className)) {
//                next = true;
//            } else if (NOT_AVAIL.equals(className)) {
//                break;
//            }
//        }
//        return null;
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)info
//     * </p>
//     *
//     * @param message
//     * @author 252956
//     * @date 2017年8月30日上午10:16:08
//     */
//    public static void info(final String message) {
//        StackTraceElement caller = getStackTraceElement(Thread.currentThread()
//                .getStackTrace());
//        if (null == caller)
//            return;
//        Logger log = LogManager
//                .getLogger(caller.getClassName() + "." + caller.getMethodName()
//                        + "() Line: " + caller.getLineNumber());
//        log.info(message);
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)info
//     * </p>
//     *
//     * @param message
//     * @param t
//     * @author 252956
//     * @date 2017年8月30日上午10:16:15
//     */
//    public static void info(final String message, Throwable t) {
//        StackTraceElement caller = getStackTraceElement(Thread.currentThread()
//                .getStackTrace());
//        if (null == caller)
//            return;
//        Logger log = LogManager
//                .getLogger(caller.getClassName() + "." + caller.getMethodName()
//                        + "() Line: " + caller.getLineNumber());
//        log.info(message, t);
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)debug
//     * </p>
//     *
//     * @param message
//     * @author 252956
//     * @date 2017年8月30日上午10:16:21
//     */
//    public static void debug(final String message) {
//        StackTraceElement caller = getStackTraceElement(Thread.currentThread()
//                .getStackTrace());
//        if (null == caller)
//            return;
//        Logger log = LogManager
//                .getLogger(caller.getClassName() + "." + caller.getMethodName()
//                        + "() Line: " + caller.getLineNumber());
//        log.debug(message);
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)debug
//     * </p>
//     *
//     * @param message
//     * @param t
//     * @author 252956
//     * @date 2017年8月30日上午10:16:27
//     */
//    public static void debug(final String message, Throwable t) {
//        StackTraceElement caller = getStackTraceElement(Thread.currentThread()
//                .getStackTrace());
//        if (null == caller)
//            return;
//        Logger log = LogManager
//                .getLogger(caller.getClassName() + "." + caller.getMethodName()
//                        + "() Line: " + caller.getLineNumber());
//        log.debug(message, t);
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)error
//     * </p>
//     *
//     * @param message
//     * @author 252956
//     * @date 2017年8月30日上午10:16:32
//     */
//    public static void error(final String message) {
//        StackTraceElement caller = getStackTraceElement(Thread.currentThread()
//                .getStackTrace());
//        if (null == caller)
//            return;
//        Logger log = LogManager
//                .getLogger(caller.getClassName() + "." + caller.getMethodName()
//                        + "() Line: " + caller.getLineNumber());
//        log.error(message);
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)error
//     * </p>
//     *
//     * @param message
//     * @param t
//     * @author 252956
//     * @date 2017年8月30日上午10:16:37
//     */
//    public static void error(final String message, Throwable t) {
//        StackTraceElement caller = getStackTraceElement(Thread.currentThread()
//                .getStackTrace());
//        if (null == caller)
//            return;
//        Logger log = LogManager
//                .getLogger(caller.getClassName() + "." + caller.getMethodName()
//                        + "() Line: " + caller.getLineNumber());
//        log.error(message, t);
//    }
//
//    /**
//     * <p>
//     * TODO(方法详细描述说明、方法参数的具体涵义)warn
//     * </p>
//     *
//     * @param message
//     * @author 252956
//     * @date 2017年8月30日上午10:16:42
//     */
//    public static void warn(final String message) {
//        StackTraceElement caller = getStackTraceElement(Thread.currentThread()
//                .getStackTrace());
//        if (null == caller)
//            return;
//        Logger log = LogManager
//                .getLogger(caller.getClassName() + "." + caller.getMethodName()
//                        + "() Line: " + caller.getLineNumber());
//        log.warn(message);
//    }
//}
