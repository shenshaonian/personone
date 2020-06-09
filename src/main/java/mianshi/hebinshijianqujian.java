package mianshi;

import org.junit.Test;
import sun.jvm.hotspot.utilities.Interval;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 合并时间区间  https://blog.csdn.net/qq_16234613/article/details/90172581
 * @author: 范子祺
 * @create: 2019-05-27 21:28
 **/
public class hebinshijianqujian {

    @Test
    public void test() {
        int[] array = new int[]{1, 2, 3, 22, 0, 3};
        BitSet bitSet = new BitSet(6);
        //将数组内容组bitmap
        for (int i = 0; i < array.length; i++) {
            bitSet.set(array[i], true);
        }
        System.out.println(bitSet.size());
        System.out.println(bitSet.get(3));

    }


    @Test
    public void dsa() {

    }


    @Test
    public void test1() {
        Interval a = new Interval(1, 3);
        Interval b = new Interval(2, 6);
        Interval c = new Interval(8, 10);
        Interval d = new Interval(15, 18);
        List<Interval> m = new ArrayList<Interval>();
        m.add(a);
        m.add(b);
        m.add(c);
        m.add(d);
        merge(m);
    }

//：[ [1, 3], [2, 6], [8, 10], [15, 18] ]


//    public List<Interval> merge(List<Interval> intervals) {
//        List<Interval> result = new ArrayList<>();
//        // 输入为空
//        if (intervals == null || intervals.size() < 1) {
//            return result;
//        }
//        int len = intervals.size();
//        int[] starts = new int[len];
//        int[] ends = new int[len];
//        //将首尾整数分别放置在两个数组中
//        for (int i = 0; i < len; i++) {
//            starts[i] = (int) intervals.get(i).getLowEndpoint();
//            ends[i] = (int) intervals.get(i).getHighEndpoint();
//        }
//        // 对两个数组进行排序
////        Arrays.sort(starts);
////        Arrays.sort(ends);
//        // 合并重叠区间
//        for (int i=0,j=0; i < len; i++) {
//            if(i == len - 1 || starts[i + 1] < ends[i]) {
//                result.add(new Interval(starts[j], ends[i]));
//                j = i + 1;
//            }
//        }
//        return result;
//    }


    //    [                     [
//            [1, 3],               [1, 6],
//            [2, 6],      =>       [8, 10],
//            [8, 10],              [15, 18]
//            [15, 18]            ]
//            ]
//            ---------------------
    @Test
    public void test2() {
        Interval in1 = new Interval(1, 3);
        Interval in2 = new Interval(2, 6);
        Interval in3 = new Interval(8, 10);
        Interval in4 = new Interval(15, 18);
        List<Interval> ls = new LinkedList<Interval>();
        ls.add(in1);
        ls.add(in2);
        ls.add(in3);
        ls.add(in4);
        for (Interval in : merge(ls)) {
            System.out.println(in.getLowEndpoint() + " " + in.getHighEndpoint());
        }
    }

    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1)
            return intervals;
        List<Interval> res = new LinkedList<Interval>();
        intervals.sort((i1, i2) -> Integer.compare((int) i1.getLowEndpoint(), (int) i2.getLowEndpoint()));
        int start = (int) intervals.get(0).getLowEndpoint();
        int end = (int) intervals.get(0).getHighEndpoint();
        for (Interval in : intervals) {
            if ((int) in.getLowEndpoint() <= end) {
                end = Math.max((int) in.getHighEndpoint(), end);
            } else {
                res.add(new Interval(start, end));
                start = (int) in.getLowEndpoint();
                end = (int) in.getHighEndpoint();
            }
        }
        res.add(new Interval(start, end));
        return res;
    }
}


//class Interval {
//    int start;
//    int end;
//
//    Interval() {
//        start = 0;
//        end = 0;
//    }
//
//    Interval(int s, int e) {
//        start = s;
//        end = e;
//    }
//}
