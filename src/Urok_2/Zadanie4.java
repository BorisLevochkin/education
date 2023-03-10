package Urok_2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Zadanie4 {

    public static void main(String[] args) {

        String a = "Вася";
        int b = 7;

        textRaz(a, b);

    }
    public static void textRaz(String a, int b) {
        System.out.println(b);
        String c = a;
        for (int i = 1; i < b; i++) {
            c = c + " " + a;

        }
        System.out.println("c = " + c);

        /*
        Всё верно, но как-то ты перемудрил :).
        На всякий случай пусть ещё будет твой прежний вариант и типа более продвинутый вариант (но здесь не уместный, так как
        более длинный, да и не ведет к какой-либо оптимизации) через стримы.
         */
//        System.out.println((a + " ").repeat(7));
//        Stream.of(a).map(x -> x + " ").map(x -> x.repeat(7)).forEach(System.out::println);

        /*
        также твой вариант с циклами можно было сделать лаконичнее и несколько проще и понятнее
         */

//        for (int i = 1; i <= b; i++) {
//            System.out.println(a); //будет выводить с новой строки
//        }
//
//        for (int i = 1; i <= b; i++) {
//            System.out.print(a + " "); // если в одну строку через пробел
//        }
    }

}
