package Urok_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie5 {

    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i<10; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            }
            else{
                a[i] = 1;
            }
        }
        System.out.println(Arrays.toString(a));

//        System.out.println(Arrays.stream(a).map(x ->
//                             {
//                                 if (x == 1)
//                                     return x = 0;
//                                 else
//                                     return x = 1;
//                             }).mapToObj(String::valueOf).toList());
    }
}

