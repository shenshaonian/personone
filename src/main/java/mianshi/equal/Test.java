package mianshi.equal;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 16:38
 **/
public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("chenssy", 23);
        Employee e2 = new Employee("chenssy", 24);
        Person p1 = new Person("chenssy");
        System.out.println(p1.equals(e1));
        System.out.println(p1.equals(e2));
        System.out.println(e1.equals(e2));
    }
//        ---------------------
//                作者：zejian_
//        来源：CSDN
//        原文：https://blog.csdn.net/javazejian/article/details/51348320
//        版权声明：本文为博主原创文章，转载请附上博文链接！
}
