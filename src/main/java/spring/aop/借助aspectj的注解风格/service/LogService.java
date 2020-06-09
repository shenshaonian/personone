package spring.aop.借助aspectj的注解风格.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import spring.aop.借助aspectj的注解风格.L;

/**
 * @description:
 * @author: 范子祺
 **/
@Aspect
@Component
public class LogService implements L {

    @Around(value = "execution(* spring.aop.借助aspectj的注解风格.service.ProductService.*(..))")
    public void query(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("记录日志" + joinPoint.getSignature().getName());
        joinPoint.proceed();
        System.out.println("记录日志--环绕结束" + joinPoint.getSignature().getName());
    }

    @Override
    public void query() {

    }
}
