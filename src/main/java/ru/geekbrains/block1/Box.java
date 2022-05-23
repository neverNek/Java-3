package ru.geekbrains.block1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> box = new ArrayList<>();

    public float getWeight() {
        float weight = 0.0f;
        for (T t : box) {
            weight += t.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }

    public void pourTo(Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }

}
