package mianshi;

import org.junit.Test;


/**
 * @description: 缩写校验
 * @author: 范子祺
 * @create: 2019-05-27 16:04
 **/
public class suoxiejiaoyan {

    @Test
    public void test() {
        String s = "applemmnmnaaaaaaaaaaxxxa", abbr = "app2mmnmn10xxx1";
//        String s = "internationalization",abbr = "internationalization";
//        String s = "internationalization",abbr = "20";

//        String s = "internationalization",abbr = "i12iz4n";
        //字母在前
//        String s = "internationalization",abbr = "in11iza3n";
        //数字在前
//        String s = "internationalizationoo",abbr = "13iza3noo";
        System.out.println(valid(s, abbr));

    }

    boolean valid(String word, String abbr) {
        String[] str_string = abbr.split("\\d+");
        String[] num_string = abbr.split("\\D+");
        //全数字
        if (str_string.length == 0 && num_string.length == 1) {
            if (Integer.parseInt(num_string[0]) == word.length()) {
                return true;
            } else {
                return false;
            }
        }
        //全字母
        if (str_string.length == 1 && num_string.length == 0) {
            if (str_string[0] == word) {
                return true;
            } else {
                return false;
            }
        }

        //数字在前
        if (str_string[0].isEmpty()) {
            for (int i = 0, j = 0; i < word.length(); j++) {
                if ((j + 1) % 2 == 1) {
                    int x = Integer.parseInt(num_string[j / 2]);
                    if (x >= word.length()) {
                        return false;
                    }
                    i = x + i;

                    continue;
                } else if ((j + 1) % 2 == 0) {
                    String temp = str_string[(j + 1) / 2];
                    if (i + temp.length() > word.length()) {
                        return false;
                    }
                    String wordTemp = word.substring(i, i + temp.length());
                    if (temp.equals(wordTemp)) {
                        i = i + temp.length();
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }

        //字母在前
        if (num_string[0].isEmpty()) {
            for (int i = 0, j = 0; i < word.length(); j++) {
                if ((j + 1) % 2 == 1) {
                    String temp = str_string[j / 2];
                    String wordTemp = word.substring(i, i + temp.length());
                    if (temp.equals(wordTemp)) {
                        i = i + temp.length();
                        continue;
                    } else {
                        return false;
                    }
                } else if ((j + 1) % 2 == 0) {
                    int x = Integer.parseInt(num_string[(j + 1) / 2]);
                    i = x + i;
                    if (i > word.length()) {
                        return false;
                    }
                    continue;
                }
            }
        }
        return true;
    }


    @Test
    public void test1() {
//        String[] s = {"in","","","z","n"};
//        String[] m = {"","","123","4"};
        String s = "internationalization", abbr = "fasdf";

        String[] str = abbr.split("\\d+");

        String[] num_string = abbr.split("\\D+");
        System.out.println(num_string.length);
        System.out.println(str);
        abbr.substring(1, 2);

    }


    @Test
    public void test2() {
//        String s = "internationalization",abbr = "i12iz4n";
        String s = "applemmnmnaaaaaaaaaaxxxa", abbr = "app2mmnmn10xxx1";
        System.out.println(validWordAbbreviation(s, abbr));
    }

    //    https://blog.csdn.net/zshouyi/article/details/70992039
    public boolean validWordAbbreviation(String word, String abbr) {
//        return word.matches(abbr.replaceAll("[1-9]\\d*",".{$0}"));
        String s = abbr.replaceAll("[1-9]\\d*", ".{$0}");
        return word.matches(s);
    }
}
