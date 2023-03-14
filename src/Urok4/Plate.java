package Urok4;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info(String a) {
        if (food >= 0) {
        System.out.println(a + " " + "plate: " + food);}
        else{System.out.println(a + " " + "plate: " + "- еды нет");}
    }
}
class Cat {
    String name1;
    private int appetite;
    public Cat(String name1, int appetite) {
        this.name1 = name1;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}

class Dog {
    String name1;
    private int appetite;
    public Dog(String name1, int appetite) {
        this.name1 = name1;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}

class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 50);
       Dog dog = new Dog("Pushik", 80);
        Plate plate = new Plate(100);
        plate.info(cat.name1);
        cat.eat(plate);
       plate.info(cat.name1);
        plate.info(dog.name1);
        dog.eat(plate);
        plate.info(dog.name1);
//        dog.eat(plate);
//        plate.info(name1);
//        cat.name1();
//        dog.name1(plate);
    }
}