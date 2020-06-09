package string相关;

import org.junit.Test;

/**
 * @description:
 * @author: 范子祺
 **/
public class 测试等等和equal {
    @Test
    public void test() {
        Student student = new Student();
        student.setName("fazi");
        Student s = new Student();
        s.setName("fazi");
        System.out.println(s.equals(student));
    }
}
