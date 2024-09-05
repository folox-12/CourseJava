package lessons.level.second.second;

/*
    1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
     Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
      должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    3 В методе main() вызвать полученный метод, обработать возможные исключения
    MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */

import lessons.level.second.second.utils.MappingArray;
import lessons.level.second.second.utils.exception.MyArrayDataException;
import lessons.level.second.second.utils.exception.MyArraySizeException;

public class App {
    public static void main(String[] args) {
        Integer result = null;

        String[][] myArray2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "r"},
                {"1", "2", "3", "4"},
        };

        try {
            result = MappingArray.getSummOfElements(myArray2);
        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println(result);
        }
    }
}
