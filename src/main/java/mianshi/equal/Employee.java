package mianshi.equal;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-30 16:38
 **/
public class Employee extends Person {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name, int id) {
        super(name);
        this.id = id;
    }

    /**
     * 重写equals()方法
     */
    public boolean equals(Object object) {
        if (object instanceof Employee) {
            Employee e = (Employee) object;
            return super.equals(object) && e.getId() == id;
        }
        return false;
    }

//---------------------
//    作者：zejian_
//    来源：CSDN
//    原文：https://blog.csdn.net/javazejian/article/details/51348320
//    版权声明：本文为博主原创文章，转载请附上博文链接！
}
