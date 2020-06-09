package leetcode.String;

import org.junit.Test;

/**
 * @description:请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为 We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author: 范子祺
 **/
public class 替换空格 {
    public class Solution {
        public String replaceSpace(StringBuffer str) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < str.toString().length(); i++) {
                if (String.valueOf(str.charAt(i)).endsWith(" ")) {
                    stringBuilder.append("%20");
                } else {
                    stringBuilder.append(String.valueOf(str.charAt(i)));
                }
            }
            return stringBuilder.toString();
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();
        String s = solution.replaceSpace(new StringBuffer("We Are Happy"));
        System.out.println(s);
    }

}
