package one.javaBase.reflectionTest;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-12 21:45
 **/
public class StudentInvoke extends PersonInvoke {
    private void method1(Integer age) {
        System.out.println("Student private void method1, age=:" + age);
    }
}
