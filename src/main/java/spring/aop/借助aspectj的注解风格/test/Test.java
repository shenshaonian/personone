package spring.aop.借助aspectj的注解风格.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.aop.借助aspectj的注解风格.service.ProductService;

/**
 * @description:
 * @author: 范子祺
 **/
public class Test {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"aop.xml"});
        ProductService s = (ProductService) context.getBean("s");
        s.login();

    }
}
