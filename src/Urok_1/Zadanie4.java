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

        /*
        Использование вложенного условия излишне. Вот если бы нужно было делать какие-то особые действия с числами более 0, то смысл был бы
        Лучше будет сделать вот так:

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }

        А ещё, если в условии только одно действие, то весь этот код можно записать вот так:

        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Жёлтый");
        else
            System.out.println("Зелёный");

        То есть без использования фигурных скобок. Дело вкуса, я, например, всегда их ставлю. Мне так удобнее.
         */

        return;//лишнее
    }

}

