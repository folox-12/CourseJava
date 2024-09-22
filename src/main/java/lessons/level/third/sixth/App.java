package lessons.level.third.sixth;
/*
1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
 Написать набор тестов для этого метода (по 3-4 варианта входных данных).
Вx: [124423417] -> вых: [17].
2.Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хотьодной четверки или единицы, то метод вернет false;
 Написать набор тестов для этого метода (по 3-4 варианта входных данных).
[11144144] -> true
[111111] -> false
[4444] -> false
[1441143] -> false
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    static final int DIGITAL_AFTER_RETURNING_FOUR = 4;
    static final int DIGITAL_AFTER_RETURNING_ONE = 1;

    public static void main(String[] args) {
        Integer[] item = new Integer[]{4, 5, 2, 5, 4, 1};

        Integer[] modifiedItem = copyItemsAfterFour(item);
        boolean isCorrect = isArrayIncluedNumbers(item);

        System.out.println(isCorrect);
        System.out.println(Arrays.toString(modifiedItem));
    }

    public static Integer[] copyItemsAfterFour(Integer[] items) throws RuntimeException {
        List<Integer> arrayList = Arrays.asList(items);
        List<Integer> result = new ArrayList<>();
        Collections.reverse(Arrays.asList(items));

        if (!arrayList.contains(DIGITAL_AFTER_RETURNING_FOUR)) throw new RuntimeException();

        for (int i = 0; i < arrayList.indexOf(DIGITAL_AFTER_RETURNING_FOUR); i++) {
            result.add(arrayList.get(i));
        }

        Collections.reverse(result);
        return result.toArray(new Integer[0]);
    }

    public static boolean isArrayIncluedNumbers(Integer[] array) {
        List<Integer> arrayList = Arrays.asList(array);

        return arrayList.containsAll(
                new ArrayList<>(Arrays.asList(DIGITAL_AFTER_RETURNING_ONE, DIGITAL_AFTER_RETURNING_FOUR))
        );
    }
}
