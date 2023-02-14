package Urok_2;

public class Zadanie1 {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        System.out.println(checkSum(a, b));

    }
    public static boolean checkSum(int a, int b) {

        if ((a + b >= 10) && (a + b <= 20)) return true;

        else return false;


    }

}
