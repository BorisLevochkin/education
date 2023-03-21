package Urok7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Save {

    public static void main(String args[]){
        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("id");
            sb.append(',');
            sb.append("Name");
            sb.append(',');
            sb.append("Address");
            sb.append('\n');

            sb.append("61");
            sb.append(',');
            sb.append("Rik Morti");
            sb.append(',');
            sb.append("RnD");
            sb.append('\n');

            writer.write(sb.toString());
            writer.close(); //Зачем? Конструкция try-with-resources сама закроет
            System.out.println("Файл записан");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


// норм, только не соответствует заданию
}
