//package spring.aop.借助aspectj的注解风格.test;
//
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.junit.After;
//import org.junit.Before;
//import org.springframework.stereotype.Component;
//
///**
// * @description:
// * @author: 范子祺
// **/
//
//@Component
//@Aspect
//public class LuBanAspect {
//
//    @Pointcut("execution(*service)")
//    public void pointCut() {
//        System.out.println("1---");
//    }
//
//    @Pointcut("execution(*dao)")
//    public void pointCutDao() {
//        System.out.println("2---");
//    }
//
//    @After("pointCutDao()")
//    public void adviceDao() {
//        System.out.println("3---");
//    }
//
//
//    @Before("pointCut()")
//    public void advice() {
//        System.out.println("4---");
//    }
//
//}
