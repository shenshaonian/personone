package mianshi.equal;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 16:37
 **/
public class Person {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public boolean equals(Object object) {
        if (object instanceof Person) {
            Person p = (Person) object;
            if (p.getName() == null || name == null) {
                return false;
            } else {
                return name.equalsIgnoreCase(p.getName());
            }
        }
        return false;
    }

//---------------------
//    作者：zejian_
//    来源：CSDN
//    原文：https://blog.csdn.net/javazejian/article/details/51348320
//    版权声明：本文为博主原创文章，转载请附上博文链接！
}
