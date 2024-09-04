package lessons.level.second.first;
/*
    Практическое задание
1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
     результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */

import lessons.level.second.first.entity.*;
import lessons.level.second.first.utils.IFullMoveableAbility;
import lessons.level.second.first.utils.IObstruction;

public class App {
    public static void main(String[] args) {
        IObstruction[] obstracions =

                {
                        new Wall(10),
                        new Treadmill(100),
                        new Wall(5),
                        new Treadmill(1000),
                };

        IFullMoveableAbility[] participants = {
                new Human(10, 500),
                new Robot(200, 5000),
                new Cat(2, 1000),
        };

        for (IFullMoveableAbility participant : participants) {
            for (IObstruction obstraction : obstracions) {
                try {
                    obstraction.overcomeThrough(participant);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
        }

    }
}
