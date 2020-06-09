package one;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: 范子祺
 **/
public class DateTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        System.out.printf(sdf.format(new Date()));
    }
}
