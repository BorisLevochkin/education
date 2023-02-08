package Urok_1;

public class Zadanie4 {
    public static void main(String[] args) {

        printColor();

    }
    public static void printColor(){
        int value = -1000;

        if (value<=0) {
            System.out.println("Красный 1");
        }
        if (0 < value)  {

            if (value<=100)  {
                System.out.println("Желтый 2");
            }
            else {
                System.out.println("Зеленый 3");
            }
        }

        return;
    }

}

