package Urok8.Zadanie1;

import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        List<String> sity = Arrays.asList("Riihimäki", "Lenin", "Helsinki", "Lenin", "Moskov", "Oulu", "Turku", "Tampere",
                "Vaasa", "Varshava", "Rylsk", "Moskov", "Lenin", "Pietari", "Minsk", "Rylsk", "Ahtubinsk", "Paris", "Helsinki", "London");
        System.out.println("Исходный список:");
        sity.forEach(value -> System.out.println(value));

        System.out.println("\nПодсчёт колличества повторов:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : sity) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

        System.out.println("\nГорода без повторов");
        for (Map.Entry<String, Integer> e : wordsCount.entrySet()) {
            if (e.getValue()<2){
            System.out.println(e.getKey());}

        }
    }
}
