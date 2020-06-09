package spring.aop.借助aspectj的注解风格.service;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: 范子祺
 **/
@Component("s")
public class ProductService {

    public void login() {
        System.out.println("登录主要逻辑");
    }
}
