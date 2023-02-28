package Urok5;
import java.util.ArrayList;
import java.util.Arrays;
public class Zadanie2 {

    public class Box<T extends Fruit> {
        private ArrayList<T> items;

        public Box(T... items) {
            this.items = new ArrayList<T>(Arrays.asList(items));
        }

        public void add(T... items) {
            this.items.addAll(Arrays.asList(items));
        }

        public void remove(T... items) {
            for (T item: items) this.items.remove(item);
        }

        public ArrayList<T> getItems() {
            return new ArrayList<T>(items);
        }


    }
    public abstract class Fruit {
        protected float weight;

        public Fruit(float weight) {
            this.weight = weight;
        }

    }

}