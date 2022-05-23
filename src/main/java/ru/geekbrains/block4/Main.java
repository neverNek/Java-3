package ru.geekbrains.block4;

public class Main {
    static volatile char c = 'A';
    static final Object mon = new Object();

    public static void main(String[] args) {
        new Thread(new WaitNotify('A', 'B')).start();
        new Thread(new WaitNotify('B', 'C')).start();
        new Thread(new WaitNotify('C', 'A')).start();
    }
}
