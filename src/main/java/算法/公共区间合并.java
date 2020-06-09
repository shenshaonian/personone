package 算法;



import sun.jvm.hotspot.utilities.Interval;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @description:
 * @author: 范子祺
 **/
public class 公共区间合并 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        StringBuilder[] stringBuilders = new StringBuilder[];
//        String[] ss = new String[];
//        while (in.hasNext()){
////            stringBuilders.
//            String[] s = in.nextLine().split(" ");
////            ss = ss.clone();
//        }

        String s = in.nextLine();
        List<Interval> list = new ArrayList<>();
        String[] s1 = s.split(" ");
        for (int i=0;i<s1.length;i++) {
            String[] s2 = s1[i].split(",");
            Interval interval = new Interval(
                    Integer.valueOf(s2[0]), Integer.valueOf(s2[1])
            );
            list.add(interval);
        }
            ArrayList<Interval> list1 = new ArrayList<>();
            list1 = (ArrayList<Interval>) merge(list);
            Iterator<Interval> it = list1.iterator();
            while (it.hasNext()){
                Interval interval1 = it.next();
                if (it.hasNext()==false){
                    System.out.println(interval1.getLowEndpoint()+","+interval1.getHighEndpoint());
                }else {
                    System.out.println(interval1.getLowEndpoint()+","+interval1.getHighEndpoint()+" ");
                }

            }

    }

    public static List<Interval> merge(List<Interval> intervals){
        ArrayList<Interval> intervals1 = new ArrayList<>();
        if (intervals.size() == 0){
            return intervals;
        }
        for (int i = 0;i<intervals.size();i++){
            for (int j = i+1;j<intervals.size();j++){
                if ((Integer)intervals.get(i).getLowEndpoint() > (Integer) intervals.get(j).getLowEndpoint()){
                    Interval te = intervals.get(i);
                    intervals.set(i, intervals.get(j));
                    intervals.set(j,te);
                }
            }
        }
        int min = (Integer)intervals.get(0).getLowEndpoint();
        int max = (Integer)intervals.get(0).getHighEndpoint();
        for (int i = 1;i<intervals.size();i++){
            if ((Integer)intervals.get(i).getLowEndpoint() <max){
                max = (Integer) intervals.get(i).getHighEndpoint() > max ?(Integer) intervals.get(i).getHighEndpoint():max;
            }else {
                intervals1.add(new Interval(min,max));
                min = (Integer) intervals.get(i).getLowEndpoint();
                max = (Integer) intervals.get(i).getHighEndpoint();

            }
        }
        intervals1.add(new Interval(min,max));
        return intervals1;
    }
}
