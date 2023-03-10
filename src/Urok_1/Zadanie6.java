package Urok_1;

import static Urok_1.Zadanie2.printThreeWords;
import static Urok_1.Zadanie3.checkSumSign;
import static Urok_1.Zadanie4.printColor;

public class Zadanie6 {
    public static void main(String[] args) {
        Zadanie5 zadanie = new Zadanie5();

        printThreeWords();
        checkSumSign();
        printColor();
        zadanie.compareNumbers();
    }
}
/*
Все предыдущие задания можно было делать в классах без использования в них метода main().

А как нужно будет вызывать эти методы, если классы, их содержащие не будут иметь метода main() и сами методы не будут статическими?

А ещё в текущей реализации можно использовать статические импорты, тогда вызов методов будет ещё лаконичнее
 */