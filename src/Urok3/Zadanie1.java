package Urok3;

import java.util.Arrays;

public class Zadanie1 {

    public static void main(String[] args) {//Создать массив из 5 сотрудников
    int a = 4;
            Employee[] empCorp = new Employee[5];
            empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 50000, 41);
            empCorp[1] = new Employee("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314", 50000, 32);
            empCorp[2] = new Employee("Sidorov Sidr", "Water pot", "sidorov@mailbox.com", "892312315", 10000, 43);
            empCorp[3] = new Employee("Pupkina Nadegda", "EnvelopeLicker", "pupkina@mailbox.com", "892312316", 5000, 18);
            empCorp[4] = new Employee("Juk J", "GrinderPencil", "juk@mailbox.com", "892312317", 3000, 21);
            System.out.println(Arrays.toString(empCorp));
            Employee Vasy = empCorp[a];
//            Employee.printInfo(Vasy);


 //С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
                for (Employee employee : empCorp)
                    if (employee.age > 40)
                        Employee.printInfo(employee);

        }


//        System.out.println(Arrays.toString(empCorp));
    }
    //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст
    class Employee {
        String name;
        String position;
        String email;
        String phone;
        int salary;
        int age;
        public static void printInfo(Employee employee){
            System.out.println(employee.name);
            System.out.println(employee.position);
            System.out.println(employee.email);
            System.out.println(employee.phone);
            System.out.println(employee.salary);
            System.out.println(employee.age);
        }
//Конструктор класса должен заполнять эти поля при создании объекта.
        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
    }

