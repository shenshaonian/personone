package one.javaBase.enumtest;

/**
 * 代收类型
 */
public enum DshkTypeEnum {

    /**
     * 即日退
     */
    INTRADAY("INTRADAY", "即日退", "11111"),

    /**
     * 三日退
     */
    NORMAL("NORMAL", "三日退", "22222"),

    /**
     * 无
     */
    NONE("NORMAL", "无", "3333333");

    DshkTypeEnum(String type) {
        this.type = type;
    }

    DshkTypeEnum(String type, String description, String third) {
        this.third = third;
        this.type = type;
        this.description = description;
    }

    private String type;

    private String description;

    private String third;

    public String getThird() {
        return third;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
