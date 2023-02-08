package Urok_1;

public class Zadanie6 {
    public static void main(String[] args) {
        Zadanie2.printThreeWords();
        Zadanie3.checkSumSign();
        Zadanie4.printColor();
        Zadanie5.compareNumbers();
    }
}
/*
Все предыдущие задания можно было делать в классах без использования в них метода main().

А как нужно будет вызывать эти методы, если классы, их содержащие не будут иметь метода main() и сами методы не будут статическими?

А ещё в текущей реализации можно использовать статические импорты, тогда вызов методов будет ещё лаконичнее
 */