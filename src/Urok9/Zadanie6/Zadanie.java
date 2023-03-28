package Urok9.Zadanie6;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;
public class Zadanie {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String s;
    ArrayList<String> AL = new ArrayList<String>();

    System.out.println("Enter Login: ");
    while (true) {
        System.out.print("Login = ");
        s = scanner.nextLine();
        if (s.equals("")==true)
            break;
        AL.add(s);
    }
    System.out.println();
    System.out.println("AL = " + AL);

        Predicate<String> fn;

        fn = (str) -> {
            if (str.charAt(0)=='f')
                return true;
            return false;
            // можно упростить до return str.charAt(0) == 'Л';
        };

        Stream<String> stream = AL.stream();

        Stream<String> resStream = stream.filter(fn);
        resStream.forEach(System.out::println);
}


}
