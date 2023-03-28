package Urok9.Zadanie3;

import java.util.Arrays;
import java.util.Collection;


public class Zadanie {
    public static void main(String[] args) {
        int b;
        Collection<String> collection = Arrays.asList("Highload", "High", "Load", "Highload", "Highload", "High", "Load");
        System.out.println("Исходный список");
        System.out.println(collection);
        String a = "Highload";
        b= collection.size() - 1;
        System.out.println("Количество " + a + " = " + collection.stream().filter(a::equals).count());
        System.out.println("Количество " + a + " = " + collection.stream().findFirst().orElse("0"));
        System.out.println("Количество " + a + " = " + collection.stream().skip(b).findFirst().orElse("0"));
    }
}
