package lessons.level.third.first.entity;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    ArrayList<T> fruits = new ArrayList<>();

    public float getWeights() {
        if (fruits.isEmpty()) return 0;
        return fruits.size() * fruits.get(0).getWeight();
    }

    public void addFruit(T fruit) {
            fruits.add(fruit);
    }

    public void putFruit(Box<T> box) {
        if (this.equals(box)) System.out.println("It is the same box");

        fruits.forEach(fruit -> {
            box.addFruit(fruit);
        });

        fruits.clear();
    }

    public boolean compare(Box<? extends Fruit> b) {
        return getWeights() == b.getWeights();
    }
}
