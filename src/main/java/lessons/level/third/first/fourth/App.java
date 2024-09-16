package lessons.level.third.first.fourth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Создать три потока, каждый из которых выводит определенную букву
// (А, В и С) 5 раз
// (порядок - АВСАВСАВС). Используйте wait/notify/notifyAll.
public class App {
    private static final Object lock = new Object();
    private static int count = 0;
    private static int currentLetter = 0;
    private static final List<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C'));

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> printLetter(letters.get(0)));
        Thread threadB = new Thread(() -> printLetter(letters.get(1)));
        Thread threadC = new Thread(() -> printLetter(letters.get(2)));

        threadA.start();
        threadB.start();
        threadC.start();
    }

    private static void printLetter(char letter) {
        int howManyRepeates = 5;
        synchronized (lock) {
            while (count < letters.size() * howManyRepeates) {
                while (currentLetter != letters.indexOf(letter)) {
                    try {
                        lock.wait(); // Ожидание, если не наш черед
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print(letter);
                count++;
                currentLetter = (currentLetter + 1) % letters.size();
                lock.notifyAll();
            }
        }
    }
}
