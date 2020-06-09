package yanjiu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @description:
 * @author: 范子祺
 **/
public class arraystream {

    @Test
    public void test糖果分配() {
        int[] a = {1, 3, 4, 10, 5, 5, 5, 6, 7, 8, 9};
        List<Boolean> booleans = kidsWithCandies(a, 1);
        System.out.println(booleans);
    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        IntStream stream = Arrays.stream(candies);
        OptionalInt i = stream.max();
        int asInt = i.getAsInt();

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add((candy + extraCandies) >= max);
        }
        return result;

    }
}
