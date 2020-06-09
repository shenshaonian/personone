package 算法;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @description:
 * @author: 范子祺
 **/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String[] string1 = in.nextLine().split(" ");
            String[] string2 = in.nextLine().split(" ");
            String[] string3 = in.nextLine().split(" ");
            int i = Integer.valueOf(string3[0]);
            ArrayList<Integer> a = new ArrayList<>(string1.length);
            ArrayList<Integer> b = new ArrayList<>(string2.length);

            for (String s:string1) {
                a.add(Integer.valueOf(s));
            }
            for (String s:string2) {
                b.add(Integer.valueOf(s));
            }
            a = bubbleSorta(a);
            b = bubbleSorta(b);
            ArrayList<Integer> c = new ArrayList<>(i*i);
            int sum = 0;
                for (int j = 0;j<a.size();j++){
                    for (int m = 0;m<b.size();m++){
                        c.add(a.get(j)+b.get(m));
                    }
                }
                c = bubbleSorta(c);
                for (int j = 0;j<i;j++){
                    sum += c.get(j);
                }
//            }


            System.out.println(sum);
        }
    }

    public  static ArrayList<Integer> bubbleSorta(ArrayList<Integer> a) {
        int length = a.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (a.get(j+1) < a.get(j)) {
                    swaps(a, j);
                }
            }
        }
        return a;
    }

    private  static void swaps(ArrayList<Integer> a, int j) {
        int temp = a.get(j);
        a.set(j,a.get(j + 1));
        a.set(j + 1,temp);
    }
}
