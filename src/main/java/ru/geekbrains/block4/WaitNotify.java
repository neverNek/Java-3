package ru.geekbrains.block4;

import static ru.geekbrains.block4.Main.c;
import static ru.geekbrains.block4.Main.mon;

public class WaitNotify implements Runnable {
    private final char currentLetter;
    private final char nextLetter;

    public WaitNotify(char currentLetter, char nextLetter) {
        this.currentLetter = currentLetter;
        this.nextLetter = nextLetter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (mon) {
                try {
                    while (c != currentLetter)
                        mon.wait();
                    System.out.print(currentLetter);
                    c = nextLetter;
                    mon.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
