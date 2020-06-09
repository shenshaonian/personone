package mianshi.jiaoti;

import org.junit.Test;

import java.util.ArrayList;


/**
 * @description: 合并时间区间
 * @author: 范子祺
 * @create: 2019-05-27 21:28
 **/
public class hebinshijianqujian {

    //[[1, 3], [2, 6], [8, 10], [15, 18] ];
    @Test
    public void test() {
        int[][] a = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        for (int[] m : a) {
            for (int n : m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("合并区间后");
        int[][] b = merge(a);

        for (int[] m : b) {
            for (int n : m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        ArrayList<int[]> out = new ArrayList<int[]>();
        int[] tmp = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= tmp[1]) {
                tmp[1] = Math.max(tmp[1], intervals[i][1]);
            } else {
                out.add(tmp);
                tmp = intervals[i];
            }
        }
        out.add(tmp);
        return out.toArray(new int[out.size()][2]);
    }

}




