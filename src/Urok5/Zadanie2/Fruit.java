package Urok5.Zadanie2;

public abstract class Fruit {
    protected float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() { //можно было бы назвать  наче, а то при вызове этого метода в классе Box в методе с такім же названіем
        // сложно сразу понять, что там происходит. Я сначала про рекурсию подумал
        return weight;
    }
}
