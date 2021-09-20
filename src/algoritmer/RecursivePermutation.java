package algoritmer;

import java.util.Arrays;

public class RecursivePermutation {

    //        COPY:
    public static void recursive_permutation(int[] values, int a) {
        if (a == values.length - 1) {
            System.out.println(Arrays.toString(values));
        }

        for (int i = a; i < values.length; i++) {
            Swap.swap(values, i, a);
            recursive_permutation(values, a + 1);
            Swap.swap(values, a, i);
        }
    }
//
}
