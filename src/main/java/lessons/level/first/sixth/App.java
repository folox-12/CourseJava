package lessons.level.first.sixth;

/*
    1. Создать классы Собака и Кот с наследованием от класса Животное.
    2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
    препятствия. Результатом выполнения действия будет печать в консоль. (Например,
  dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
    кот не умеет плавать, собака 10 м.).
    4. * Добавить подсчет созданных котов, собак и животных.
 */

public class App {

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Cat vasyka = new Cat("Vasyka");

        Dog gav = new Dog("Gav");
        Dog kusachka = new Dog("Kusachka");
        Dog bobik = new Dog("Bobik");

        bobik.run(150);
        bobik.swim(9);

        vasyka.swim(100);

        Animal.howManyAnimals();

    }
}
