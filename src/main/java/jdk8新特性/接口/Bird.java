package jdk8新特性.接口;

import org.junit.Test;

/**
 * @description:
 * @author: 范子祺
 **/
public class Bird implements fly {

    @Test
    public void test() {
        Bird bird = new Bird();
        fly.birdsFly();
    }
}
