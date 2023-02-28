package Urok5;
import java.util.List;
import java.util.Arrays;
public class Zadanie2 {

    public static void main(String[] args) {
        String[] arr = {"asd", "ds", "ret", "123"};
        System.out.println("Ver. 1\n" + Arrays.toString(arr));
        List<String> list = convertToList(arr);
        System.out.println( "Ver. 2\n" + list.getClass() + " : " + list);

    }
    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
