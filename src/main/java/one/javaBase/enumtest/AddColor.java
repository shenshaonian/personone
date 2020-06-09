package one.javaBase.enumtest;

/**
 * @Auther: 范子祺
 * @Date: 2019/5/11 22:35
 * @Description:
 */
public enum AddColor {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);

    private String name;
    private int index;

    /**
     * @param name
     * @param index
     */
    private AddColor(String name, int index) {
        this.name = name;
        this.index = index;
    }

    /**
     * @param index
     * @return
     */
    public static String getName(int index) {
        for (AddColor c : AddColor.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
