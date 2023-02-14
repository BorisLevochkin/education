package Urok_2;

public class Zadanie4 {

    public static void main(String[] args) {

        String a = "Вася";
        int b = 7;

        textRaz(a, b);

    }
    public static void textRaz(String a, int b) {
        System.out.println(b);
        String c = a;
        for (int i = 1; i < b; i++) {
            c = c + " " + a;

        }
        System.out.println("c = " + c);
    }

}
