package lessons.level.second.fifth;
/*
Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:
static final int SIZE =10000000; static final int HALF = size /2;
float[] arr = new float[size];
2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f+i /2));
5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
Отличие первого метода от второго:
● Первый просто бежит по массиву и вычисляет значения.
● Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и
потом склеивает эти массивы обратно в один.
Пример деления одного массива на два:
● System.arraycopy(arr, 0, a1, 0, h);
● System.arraycopy(arr, h, a2, 0, h).
Пример обратной склейки:
● System.arraycopy(a1, 0, arr, 0, h);
● System.arraycopy(a2, 0, arr, h, h).
Примечание:
System.arraycopy() — копирует данные из одного массива в другой:
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
По замерам времени:
Для первого метода надо считать время только на цикл расчета:
Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
 */

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws InterruptedException {
        float[] arr1 = myFirstMethod();
        float[] arr2 = mySecondMethod();

        System.out.println(Arrays.equals(arr1, arr2));
    }

    public static float[] createArray() {
        return new float[100_000_000];
    }

    public static float editFloat(int i) {
        return (float) (i * Math.sin(0.2f + (double) i / 5) * Math.cos(0.2f + (double) i / 5) * Math.cos(0.4f + (double) i / 2));
    }


    public static float[] myFirstMethod() {
        float[] myArray = createArray();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = editFloat(i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Время для первого метода: " + (endTime - startTime));
        return myArray;
    }

    public static float[] mySecondMethod() throws InterruptedException {
        float[] array = createArray();
        int middleOfArray = array.length / 2;
        float[] arrayFirst = new float[middleOfArray];
        float[] arraySecond = new float[middleOfArray];

        long startTime = System.currentTimeMillis();
        System.arraycopy(array, 0, arrayFirst, 0, middleOfArray);
        System.arraycopy(array, middleOfArray, arraySecond, 0, middleOfArray);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < arrayFirst.length; i++) {
                arrayFirst[i] = editFloat(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < arraySecond.length; i++) {
                arraySecond[i] = editFloat(i + middleOfArray);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        System.arraycopy(arrayFirst, 0, array, 0, middleOfArray);
        System.arraycopy(arraySecond, 0, array, middleOfArray, middleOfArray);

        long endTime = System.currentTimeMillis();

        System.out.println("Время для второго метода: " + (endTime - startTime));
        return array;
    }
}
