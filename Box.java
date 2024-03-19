import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        super();
    }

    private float getBoxWeight() {
        float weight = 0;
        for (T t : fruits) {
            weight += t.getWeight();
        }
        return weight;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public boolean compare(Box<T> box) {
        return box.getBoxWeight() == this.getBoxWeight() ? true : false;
    }

    public void moveFruitsToOtherBox(Box<T> box) {
        for (T t : fruits) {
            box.addFruit(t);
        }
        fruits.clear();
    }

}
