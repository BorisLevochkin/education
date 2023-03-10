package Urok_2;

public class Zadanie1 {

    public static void main(String[] args) {

        int a = 50;
        int b = 7;

        //Здесь норм, но в реальности всегда нужно давать переменным осознанные названия, иначе не пропустят на код-ревью

        System.out.println(checkSum(a, b));

    }
    public static boolean checkSum(int a, int b) {

        if ((a + b >= 10) && (a + b <= 20)) return true;

        else return false;

        /*
        Старайся в одну строку всё не писать.
        return лучше перенести на новую строку

        В этом методе можно было даже вообще упростить и просто написать вот так:
        return (a + b >= 10) && (a + b <= 20);
         */
    }

}
