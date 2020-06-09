package 设计模式.代理模式;

/**
 * @description:
 * @author: 范子祺
 **/
public class GaoCuiLan implements Image {
    private String name;

    public GaoCuiLan(String name) {
        this.name = name;
        loadFromDisk(name);
    }

    private void loadFromDisk(String name) {
        System.out.println("第一次获得资源需要从磁盘加载,资源名:" + name);
    }

    @Override
    public void display() {
        System.out.println("高翠兰的样子，代理是" + name);
    }
}
