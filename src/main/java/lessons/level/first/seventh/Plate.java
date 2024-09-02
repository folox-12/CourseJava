package lessons.level.first.seventh;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int n) throws PlateException {
        if (n >= 0) food += n;
        else {
            throw new PlateException("Нельзя добавлять отрицтельное число еды");
        }
    }

    public void decreaseFood(int n) throws PlateException {
        if (n >= 0) {
            if (n > food) {
                throw new PlateException("В тарелке мало еды");
            }

            food -= n;
        } else {
            throw new PlateException("Нельзя удалить отрицтельное число еды");
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public void info() {
        System.out.println(this.toString());
    }


}

class PlateException extends Exception {
    PlateException(String message) {
        super(message);
    }

    public String getText(String name) {
        return name + " " + super.getMessage();
    }
}

