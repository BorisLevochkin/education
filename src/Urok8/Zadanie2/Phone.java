package Urok8.Zadanie2;



public class Phone {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add("antonov", "8999123321");
        phonebook.add("antonov", "8912155326");
        phonebook.add("bobov", "8917155552");
        phonebook.add("bobov", "8913455672");
        phonebook.add("antonov", "899999999");
        phonebook.add("igorov", "899111111");
        phonebook.add("bobov", "89923231999");
        phonebook.add("smetana", "8888123113");
        phonebook.add("igorov", "8324325234");

        System.out.println("antonov" + "\n" + phonebook.get("antonov"));
        System.out.println("igorov" + "\n" + phonebook.get("igorov"));
        System.out.println("bobov" + "\n" + phonebook.get("bobov"));
        System.out.println("smetana" + "\n" + phonebook.get("smetana"));
    }
}


