package Urok_2;

public class Zadanie2 {

    public static void main(String[] args) {

        int a = -5;

        checkA(a);

    }

    private static void checkA(int a) {

        if (a >= 0) {
            System.out.println("a положительное");
        } else {
            System.out.println("a отрицательное");
        }
    }
}
