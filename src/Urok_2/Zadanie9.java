package Urok_2;

import java.util.Arrays;

public class Zadanie9 {

    public static void main(String[] args) {

        String initialValue="initialValue";
        int len = 5;

        textTab(initialValue, len);
    }

    public static void textTab(String initialValue, int len) {
        String[] a = new String[len];
        for(int i = 0; i < len; i++) {
            a[i] = initialValue;
        }
        System.out.println(Arrays.toString(a));



    }

}
