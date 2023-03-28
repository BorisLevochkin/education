package Urok9.Zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class L {
    public static void main(String[] args) {

        List sur = new ArrayList(); //
//        List<String> sur = new ArrayList<>();
        sur.add("Ес");
        sur.add("Лев");
        sur.add("Дом");
        sur.add("Кот");
        sur.add("Пол");
        sur.add("Рука");
        sur.add("Кисть");
        sur.add("Лом");
        sur.add("Шорох");
        sur.add("Лес");
        System.out.println("Исходный список");
        for (int i = 0; i < 10; i++) {
            Object secondSur = sur.get(i); //почему Object?
//            String secondSur = sur.get(i);
            System.out.print(secondSur);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println();

        Predicate<String> fn;

        fn = (str) -> {
            if (str.charAt(0)=='Л')
                return true;
            return false;
            // можно упростить до return str.charAt(0) == 'Л';
        };

        Stream<String> stream = sur.stream();

        Stream<String> resStream = stream.filter(fn);
        resStream.forEach(System.out::println);
//        sur.stream().filter(x -> x.charAt(0) == 'Л').forEach(System.out::println);
    }
}
