package ru.geekbrains.block1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] task1 = {1, 5, 3};

        System.out.println(Arrays.toString(task1));
        Main.change(task1, 0, 2);
        System.out.println(Arrays.toString(task1));

        Integer[] task2 = {1, 2, 3, 4, 5};
        Main.converts(task2);

        Box<Orange> or1 = new Box<>();
        Box<Orange> or2 = new Box<>();
        Box<Apple> ap1 = new Box<>();
        Box<Apple> ap2 = new Box<>();
        or1.addFruit(new Orange(), 5);
        or2.addFruit(new Orange(), 10);
        ap1.addFruit(new Apple(), 7);
        ap2.addFruit(new Apple(), 15);
        System.out.println("Box 1: " + or1.getWeight());
        System.out.println("Box 2: " + or2.getWeight());
        System.out.println("Box 3: " + ap1.getWeight());
        System.out.println("Box 4: " + ap2.getWeight());
        System.out.println("Box 1 equals box 3: " + or1.compare(ap1));
        System.out.println("Box 2 equals box 4: " + or2.compare(ap2));
        or1.pourTo(or2);
        ap1.pourTo(ap2);
        System.out.println("Box 1: " + or1.getWeight());
        System.out.println("Box 2: " + or2.getWeight());
        System.out.println("Box 3: " + ap1.getWeight());
        System.out.println("Box 4: " + ap2.getWeight());
    }

    public static <T> void change(T[] mass, int n1, int n2) {
        T ch = mass[n1];
        mass[n1] = mass[n2];
        mass[n2] = ch;
    }

    public static <T> void converts(T[] mass) {
        List<T> ts = Arrays.asList(mass);
        System.out.println(ts);
    }
}
