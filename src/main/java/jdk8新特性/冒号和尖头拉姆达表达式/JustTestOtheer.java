package jdk8新特性.冒号和尖头拉姆达表达式;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: 范子祺
 **/
public class JustTestOtheer {


    @Test
    public void test(){
        List<StudentGoldLoc> list = new ArrayList<>();
        list.add(new StudentGoldLoc(100L));
        list.add(new StudentGoldLoc(-100L));
        list.add(new StudentGoldLoc(-100L));
        list.add(new StudentGoldLoc(200L));
        list.add(new StudentGoldLoc(400L));
//        if (CollUtil.isEmpty(list)) {
//            //当前学生没有流水
//            return 0;
//        }

        //排除掉当前学生支出流水
        long sumGold = list.stream().filter(a -> a.getGold() > 0L).collect(Collectors.toList()).stream().mapToLong(StudentGoldLoc::getGold).sum();
        System.out.println(sumGold);
    }

}
