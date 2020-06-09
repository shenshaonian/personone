package 设计模式.代理模式;

/**
 * @description:
 * @author: 范子祺
 **/
public class SunWuKong implements Image {
    private GaoCuiLan gImage;
    private String name;

    public SunWuKong(String s) {
        this.name = s;
    }

    @Override
    public void display() {
        if (gImage == null) {
            gImage = new GaoCuiLan(name);
        }
        gImage.display();
    }
}
