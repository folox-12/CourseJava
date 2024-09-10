package lessons.level.third.first;

import lessons.level.third.first.entity.Apple;
import lessons.level.third.first.entity.Box;
import lessons.level.third.first.entity.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    Написать метод, который преобразует массив в ArrayList;
    Задача:
    а. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    Класс Вох, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    с. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока - 1.0f, апельсина - 1.5f (единицы измерения не важны);
    е. Внутри класса Вох сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
     true - если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    д. Не забываем про метод добавления фрукта в коробку.
 */
public class App {
    public static void main(String[] args) {
//        1
        Integer[] myArr = {1, 2, 3, 4, 5};

        List<Integer> myArrModified = convertArrayToArrayList(myArr);

        swapElement(myArr, 0, 1);
        System.out.println(Arrays.toString(myArr));
        System.out.println(myArrModified);

//        2

       Box<Apple> box = new Box<>();
       box.addFruit(new Apple());
       box.addFruit(new Apple());

        Box<Apple> box1 = new Box<>();
        box1.addFruit(new Apple());

        Box<Orange> box2 = new Box<>();
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());

        System.out.println(box2.compare(box1));
        box1.putFruit(box);


    }

    public static <T> ArrayList<T> convertArrayToArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static <T> void swapElement(T[] arr, int first, int second) {
        T temp = arr[first];

        arr[first] = arr[second];
        arr[second] = temp;
    }
}