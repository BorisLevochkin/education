package TEST;


import java.util.Arrays;

public class Employee {

    String fio;
    String job;
    String email;
    String telephone;
    int salary;
    int age;

    public Employee(String fio, String job, String email, String telephone, int salary, int age) {
        this.fio = fio;
        this.job = job;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(Employee employee) {

        if (age>=41) {
            System.out.println(employee.fio);
            System.out.println(employee.job);
            System.out.println(employee.email);
            System.out.println(employee.telephone);
            System.out.println(employee.salary);
            System.out.println(employee.age);
//            System.out.println(Arrays.toString(employee));
        }
        else System.out.println(fio + "  " + "возраст<41");

    }
}
class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee("Иванов Пётр Сидорович", "Дворник", "asd@mail.ru", "798712365487", 71151, 40);
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 50000, 41);
        emp[1] = new Employee("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314", 50000, 32);
        emp[2] = new Employee("Sidorov Sidr", "Water pot", "sidorov@mailbox.com", "892312315", 10000, 43);
        emp[3] = new Employee("Pupkina Nadegda", "EnvelopeLicker", "pupkina@mailbox.com", "892312316", 5000, 18);
        emp[4] = new Employee("Juk J", "GrinderPencil", "juk@mailbox.com", "892312317", 3000, 21);
//        Employee Vasy = employee[0];
//        Employee.printInfo(emp);

    }

}


