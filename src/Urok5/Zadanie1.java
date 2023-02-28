package Urok5;
import java.util.Arrays;


public class Zadanie1 {
    public static void main(String[] args) {

        String[] arr = {"abc", "def", "ggg", "123"};

        System.out.println("Ver. 1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}
