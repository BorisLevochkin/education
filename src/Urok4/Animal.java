package Urok4;
// на самом деле как-то слабовато
public class Animal {
        private int distGo;
        private int distSwim;
        private int distJump;

        public Animal(int distGo, int distSwim, int distJump) {
            this.distGo = distGo;
            this.distSwim = distSwim;
            this.distJump = distJump;
        }

        public void goDist(int n) { //старайся давать переменным нормальные названия
            distGo -= n;
        }
        public void swimDist(int m) {
            distSwim -= m;
        }
        public void distJump(int k) {
            distJump -= k;
    }

    // Не вижу методов, отвечающих за способность бегать и плавать

        public void info(String a, int go, int swim, int jump) {
//            if (dist >= 0) {
                System.out.println(a + " " + "пробежал дистанцию: " + go);
            System.out.println(a + " " + "осталось пробежать дистанцию: " + distGo);
                System.out.println(a + " " + "проплыл дистанция: " + swim);
            System.out.println(a + " " + "осталось проплыть дистанцию: " + distSwim);
                System.out.println(a + " " + "прыгнул дистанция: " + distJump);
            System.out.println(a + " " + "осталось прыгнуть дистанцию: " + jump);
            System.out.println();
//            } else {
//                System.out.println("дистанция: " + "- еды нет");
//            }
        }
    }

    class Dog1 { //В задании требовалось создать не внутренние классы, а унаследовать их от класса Animal
        private String name;
        private int go;
        private int swim;
        private int jump;

        public Dog1(String name, int go, int swim, int jump) {
            this.name = name;
            this.go = go;
            this.swim = swim;
            this.jump = jump;
        }
        public void go(Animal p) {
            p.goDist(go);
        }
        public void name(Animal a) {
            a.info(name, go, swim, jump);
        }
        public void swim(Animal r) {
            r.swimDist(swim);
        }
        public void jump(Animal r) {
            r.swimDist(swim);
        }
    }

    class Cat1 {
        private String name;
        private int go;
        private int swim;
        private int jump;

        public Cat1(String name, int go, int swim, int jump) {
            this.name = name;
            this.go = go;
            this.swim = swim;
            this.jump = jump;
//            @Override
        }
        public void go(Animal p) {
            p.goDist(go);
        }
        public void name(Animal a) {
            a.info(name, go, swim, jump);
        }
        public void swim(Animal r) {
            r.swimDist(swim);
        }
        public void jump(Animal r) {
            r.swimDist(swim);
        }
    }

    class MainClass1 { //очень странная реализация: основной класс является внутренним классом
        public static void main(String[] args) {
            Cat1 cat1 = new Cat1("Barsik", 50, 25, 10);
            Dog1 dog1 = new Dog1("Vorsik", 80, 15, 10);
            Animal animal = new Animal(150, 150, 150);

            cat1.name(animal);
            dog1.name(animal);

          }
}


