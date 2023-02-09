package Urok_1;

public class Zadanie3 {
    public static void main(String[] args) {

        checkSumSign();

    }
    public static void checkSumSign(){
        int a = 10;
        int b = 21;
//        if (a + b > 0) {
//            System.out.println("Сумма положительная");
//        }
//        else {
//            System.out.println("Сумма отрицательная");
//        }

        String result = (a + b) > 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);

        //или

        System.out.println((a + b) > 0 ? "Сумма положительная" : "Сумма отрицательная");

        return;
/* Опять же оператор return излишен.
Также существует тернарный оператор, используя который, можно сделать решение ещё более лаконичным.
Я закомментировал его использование. Можно закомментировать твое и раскомментировать мое, чтобы проверить
Общая схема такая:
условие ? результат, если правда : результат, если ложь
 */
    }
}