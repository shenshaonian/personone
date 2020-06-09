package mianshi.hebinqujian;

import java.util.LinkedList;
import java.util.List;

/**
 * @description: 合并时间区间
 * @author: 范子祺
 * @create: 2019-05-27 22:27
 **/
//http://www.bubuko.com/infodetail-2475082.html
//：[ [1, 3], [2, 6], [8, 10], [15, 18] ]
public class MergeInterval {
    public static void main(String[] args) {
        Interval i1 = new Interval(1, 3);
        Interval i2 = new Interval(2, 6);
        Interval i3 = new Interval(8, 10);
        Interval i4 = new Interval(15, 18);
        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
        intervals.add(i4);
        for (Interval i : merge(intervals)) {
            System.out.println(i.start + " " + i.end);
        }
    }

    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1)
            return intervals;
        List<Interval> res = new LinkedList<Interval>();
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval in : intervals) {
            if (in.start <= end) {
                end = Math.max(in.end, end);
            } else {
                res.add(new Interval(start, end));
                start = in.start;
                end = in.end;
            }
        }
        res.add(new Interval(start, end));
        return res;
    }

}

