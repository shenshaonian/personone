package leetcode.找规律;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: Z 字形变换
 * @author: 范子祺
 **/
public class ZigZagConversion {
    class ZSolution {

        public ZSolution() {
        }

        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }
            List<StringBuilder> rows = new ArrayList<>();
            for (int i = 0; i < Math.min(numRows, s.length()); i++) {
                rows.add(new StringBuilder());
            }
            int curRow = 0;
            boolean upOrDown = false;

            for (char c : s.toCharArray()) {
                rows.get(curRow).append(c);
                if (curRow == 0 || curRow == numRows - 1) {
                    upOrDown = !upOrDown;
                }
                curRow += upOrDown ? 1 : -1;
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (StringBuilder row : rows) {
                stringBuilder.append(row);
            }

            return stringBuilder.toString();
        }
    }

    @Test
    public void test() {
        ZSolution zSolution = new ZSolution();
        String leetcodeishiring = zSolution.convert("fzqtpmn", 3);
        System.out.println(leetcodeishiring);
//                .("LEETCODEISHIRING",3);
    }

//    class Solution {
//        public String convert(String s, int numRows) {
//            if(numRows == 1)
//                return s;
//
//            int len = Math.min(s.length(), numRows);
//            String []rows = new String[len];
//            for(int i = 0; i< len; i++) rows[i] = "";
//            int loc = 0;
//            boolean down = false;
//
//            for(int i=0;i<s.length();i++) {
//                rows[loc] += s.substring(i,i+1);
//                if(loc == 0 || loc == numRows - 1)
//                    down = !down;
//                loc += down ? 1 : -1;
//            }
//
//            String ans = "";
//            for(String row : rows) {
//                ans += row;
//            }
//            return ans;
//        }
//    }


//    class Solution {
//        public String convert(String s, int numRows) {
//
//            if (numRows == 1) return s;
//
//            List<StringBuilder> rows = new ArrayList<>();
//            for (int i = 0; i < Math.min(numRows, s.length()); i++)
//                rows.add(new StringBuilder());
//
//            int curRow = 0;
//            boolean goingDown = false;
//
//            for (char c : s.toCharArray()) {
//                rows.get(curRow).append(c);
//                if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
//                curRow += goingDown ? 1 : -1;
//            }
//
//            StringBuilder ret = new StringBuilder();
//            for (StringBuilder row : rows) ret.append(row);
//            return ret.toString();
//        }
//    }

}
