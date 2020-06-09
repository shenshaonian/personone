package 工具类.三方;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: 范子祺
 **/
public class lomok {

//    https://www.jianshu.com/p/2543c71a8e45
//
//    @Data
//    @Builder
//    @AllArgsConstructor
//    @NoArgsConstructor
//    public static class ProcessDeleteCourseRequestBean {
//        private Long classHourBatchApplyId;
//        private User handleUser;
//        private String handleComment;
//        private boolean isAgreeDelete;
//        private boolean isFromApi;
//        private CourseChangeResponsibilityType responsibilityType;
//    }

//    @NoArgsConstructor, @RequiredArgsConstructor, @AllArgsConstructor：作用于类上，用于生成构造函数。
//
//    @NoArgsConstructor：生成无参构造器；
//
//    @RequiredArgsConstructor：生成包含final和@NonNull注解的成员变量的构造器；
//
//    @AllArgsConstructor：生成全参构造器
//
//    @Data：作用于类上，是以下注解的集合：@ToString @EqualsAndHashCode @Getter @Setter @RequiredArgsConstructor
//

    public static void main(String[] args) {
        List<String> studentCourses = Collections.emptyList();
        List<String> ll = new ArrayList<>();
        ll.add("sa");
        studentCourses = ll;
        System.out.println(studentCourses);

        Integer i = 2;
        Boolean s = (i > 0) ? true : false;
        Boolean ss = i > 0;
        System.out.println(s);

        BigDecimal bdTest = new BigDecimal(1.745);
        BigDecimal bdTest1 = new BigDecimal(0.745);
        bdTest = bdTest.setScale(2, BigDecimal.ROUND_HALF_UP);
        bdTest1 = bdTest1.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("bdTest:" + bdTest); // 1.75
        System.out.println("bdTest1:" + bdTest1); // 0.74

        String doubleVal = "1.745";
        String doubleVal1 = "0.745";
        BigDecimal bdTest11 = new BigDecimal(doubleVal);
        BigDecimal bdTest111 = new BigDecimal(doubleVal1);
        bdTest = bdTest.setScale(2, BigDecimal.ROUND_HALF_UP);
        bdTest1 = bdTest1.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("bdTest:" + bdTest11); //1.75
        System.out.println("bdTest1:" + bdTest111);//0.75, no problem

//        BigDecimalUtil.notNullTrim(totalRefund,2);
        Bean bean = new Bean();
        bean.setSs("0.745");
        BigDecimal bigDecimal = new BigDecimal(bean.getSs());
        bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
//        Double.valueOf();

        Map<Long, Long> mm = new HashMap<>();
        mm.put(1L, 2L);
        mm.put(2L, 3L);
        System.out.println(mm.get(1L));

        System.out.println(mm.get(3L));

        if (true && !false) {
            System.out.println("1llll");
        }


        List<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        /**
         * 用->字符串将list内容连接
         * 结果：one->two->three->four，不用做二次处理
         */
        System.out.println(list);

//        String value=list.join(",");
//        System.out.println(value);
        String value = "1,2,3,4,5";

        String re = ",";

        String[] split = value.split(re);
        System.out.println(split);
        //字符串转数组
        List<String> receivers = Arrays.asList(value.split(re));
        System.out.println(receivers);
    }

    @Test
    public void dsa() {
        Integer a = null;
        if (a.equals(3)) {
            System.out.println("sa");
        }


    }

    @Test
    public void dsas() {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        System.out.println(new Date(instance.getTimeInMillis()));
//Calendar.YEAR

    }
}

