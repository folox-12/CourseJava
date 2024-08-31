package lessons.level.first.sixth;

public class Animal {
    static int counter = 0;

    String name;
    Integer runningDistance, swimmingDistance;

    public Animal(String name, int runningDistance, int swimmingDistance) {
        counter += 1;

        this.name = name;
        this.runningDistance = runningDistance;
        this.swimmingDistance = swimmingDistance;
    }

    static void howManyAnimals() {
        System.out.println("Всего животных: " + counter);
    }


    public void run(int distance) {
        if (runningDistance == 0) {
            System.out.println("Животное не умеет бегать");
            return;
        }
        if (distance > runningDistance) {
            System.out.println("Животное столько не пробежит");
            return;
        }

        System.out.printf("%s пробежал %d м \n", name, distance);
    }


    public void swim(int distance) {
        if (swimmingDistance == 0) {
            System.out.println("Животное не умеет плавать");
            return;
        }
        if (distance > swimmingDistance) {
            System.out.println("Животное столько не проплывет");
            return;
        }
        System.out.printf("%s проплыло %d м \n", name, distance);
    }
}
