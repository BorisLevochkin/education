package Urok9.Zadanie4;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Zadanie {
    public static void main(String[] args) {

        Collection<String> collection = Arrays.asList( "c10", "a15", "n2", "m4", "b4", "n2", "m4", "b4");
        System.out.println("Исходный список");
        System.out.println(collection);

        System.out.println("1 " + " = " + collection.stream().sorted().collect(Collectors.toList()));
        System.out.println("2 " + " = " + collection.stream().sorted((o1, o2) -> -o1.compareTo(o2)).distinct().collect(Collectors.toList()));
    }
}
