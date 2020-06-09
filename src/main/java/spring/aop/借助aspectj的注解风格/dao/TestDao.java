package spring.aop.借助aspectj的注解风格.dao;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: 范子祺
 **/
@Component
public class TestDao {
    public void daoLog() {
        System.out.println("dao");
    }
}
