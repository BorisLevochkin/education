package Urok_2;

public class Zadanie3 {

    public static void main(String[] args) {

        int a = -5;

        System.out.println(checkBooleanA(a));

    }
    public static boolean checkBooleanA(int a) {

        if (a >= 0) return true;

        else return false;
    }
}
//Неверное решение. По условие true должно возвращаться, если число отрицательное, и false - если положительное
// return (a < 0);