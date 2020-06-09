package mianshi.jiaoti;

import org.junit.Test;


/**
 * @description: 缩写校验
 * @author: 范子祺
 * @create: 2019-05-27 16:04
 **/
public class suoxiejiaoyan {

    @Test
    public void test() {
//        String s = "applemmnmnaaaaaaaaaaxxxa", abbr = "app2mmnmn10xxx1";
//        String s = "internationalization",abbr = "internationalization";
        String s = "internationalization", abbr = "";

//        String s = "internationalization",abbr = "i12iz4n";

//        String s = "internationalization",abbr = "in11iza3n";

//        String s = "internationalizationoo",abbr = "13iza3noo";
        System.out.println(valid(s, abbr));

    }

    boolean valid(String word, String abbr) {
        int sum = 0;
        int j = 0;
        for (int i = 0; i < abbr.length(); i++) {
            if (((abbr.charAt(i) - '0') >= 0) && ((abbr.charAt(i) - '0') <= 9)) {
                sum = sum * 10 + (abbr.charAt(i) - '0');
                if (sum == 0) {
                    return false;
                }
            } else {
                j = j + sum;
                sum = 0;
                if (j >= word.length() || abbr.charAt(i) != word.charAt(j)) {
                    return false;
                }
                j++;
            }
        }
        if (sum != 0) {
            if (j + sum == word.length()) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }


    @Test
    public void test1() {
        String a = "fdasfas";
        System.out.println(a.indexOf("a"));
    }
}





