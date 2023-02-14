package Urok_2;

public class Zadanie4 {

    public static void main(String[] args) {

        String a = "Вася";
        int b = 7;

        textRaz(a, b);

    }
    public static boolean textRaz(String a, int b) {
        String repeated = StringUtils.repeat(a,b)
        System.out.println(repeated);

    }

}
