package Urok_2;

public class Zadanie2 {

    public static void main(String[] args) {

        int a = -5;

        checkA(a);
//Это лишняя строчка. Не ошибка, но обычно тут не оставляют пустую строку
    }

    private static void checkA(int a) {
//Это лишняя строчка. Не ошибка, но обычно тут не оставляют пустую строку
        if (a >= 0) {
            System.out.println("a положительное");
        } else {
            System.out.println("a отрицательное");
        }
    }
}
