package one.javaBase.enumtest;

import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: 范子祺
 * @create: 2019-05-11 22:42
 **/
public class onetest {
    @Test
    public void test() {
        System.out.println(AddColor.getName(1) + "\t" + AddColor.getName(2));
        System.out.println(new Date());
    }


    @Test
    public void testDshkTypeEnum() {
//        System.out.println(DshkTypeEnum.INTRADAY);
//        System.out.println(DshkTypeEnum.INTRADAY.getType());
//        System.out.println(DshkTypeEnum.INTRADAY.getDescription());
        // 获得下单代收类型
        String dshkType = DshkTypeEnum.INTRADAY.toString();

        // 获得枚举类型
        Map<String, DshkTypeEnum> dshkype = getDshkype();


        System.out.println(dshkype);

        DshkTypeEnum dshkTypeEnum = dshkype.get(dshkType);

        if (dshkTypeEnum != null) {
            System.out.println(dshkTypeEnum.getDescription());
        } else {
            // 默认无
            System.out.println(DshkTypeEnum.NONE.getDescription());
        }

        Map<String, DshkTypeEnum> third = getThird();
        System.out.println(third);
        System.out.println(third.get(dshkType).getThird());

    }

    private Map<String, DshkTypeEnum> getThird() {
        Map<String, DshkTypeEnum> dshkType = new HashMap<>(2);
        dshkType.put(DshkTypeEnum.INTRADAY.getType(), DshkTypeEnum.INTRADAY);
//        dshkType.put(DshkTypeEnum.INTRADAY.getType(),DshkTypeEnum.INTRADAY);
        dshkType.put(DshkTypeEnum.NORMAL.getType(), DshkTypeEnum.NORMAL);
        return dshkType;
    }


    private Map<String, DshkTypeEnum> getDshkype() {
        Map<String, DshkTypeEnum> dshkType = new HashMap<>(2);
        dshkType.put(DshkTypeEnum.INTRADAY.getType(), DshkTypeEnum.INTRADAY);
//        dshkType.put(DshkTypeEnum.INTRADAY.getType(),DshkTypeEnum.INTRADAY);
        dshkType.put(DshkTypeEnum.NORMAL.getType(), DshkTypeEnum.NORMAL);
        return dshkType;
    }
}
