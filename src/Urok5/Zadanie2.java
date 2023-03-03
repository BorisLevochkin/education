package Urok5;
import java.util.ArrayList;
import java.util.Arrays;
public class Zadanie2 {

    public class Box<T extends Fruit> { //лучше выносить в отдельный класс
        private ArrayList<T> items;

        public Box(T... items) {
            this.items = new ArrayList<T>(Arrays.asList(items)); //здесь Т можно не писать
        }

        public void add(T... items) {
            this.items.addAll(Arrays.asList(items));
        }

        public void remove(T... items) {
            for (T item : items)
                this.items.remove(item);
        }

        public ArrayList<T> getItems() {
            return new ArrayList<T>(items); //если это геттер, то почему возвращаем не просто items?
        }


    }
    public abstract class Fruit { //чем тебе так нравятся внутренние классы?
        protected float weight;

        public Fruit(float weight) {
            this.weight = weight;
        }

    }

}