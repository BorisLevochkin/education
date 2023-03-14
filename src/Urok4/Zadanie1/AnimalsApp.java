package Urok4.Zadanie1;

class AnimalsApp {
    public static void main(String[] args) {
       Animal animal = new Animal(100, 50, 30);
        Cat cat = new Cat("Барсик", 50, 20,10);
        Dog dog = new Dog("Мухтар", 90, 30,20);
        animal.Info();
        cat.DistR(animal);
        cat.DistS(animal);
        cat.DistJ(animal);
        animal.Info();

        dog.DistR(animal);
        dog.DistS(animal);
        dog.DistJ(animal);
        animal.Info();
    }
}
