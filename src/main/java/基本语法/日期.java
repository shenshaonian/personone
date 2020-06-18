package 基本语法;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: 范子祺
 **/
public class 日期 {
    @Test
    public void test(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int i = 100;
        Date parse = null;
//        new Integer()
//                new String()
//        new Thread()
        try {
            parse = simpleDateFormat.parse("2015-03-20 19:29:" + (i % 60));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(i+":"+parse);
    }
}
