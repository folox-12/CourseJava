package lessons.level.first.seventh;

public class Cat {
    private String name;
    private int appetiteValue;
    private boolean isHungry = true;

    public Cat(String name, int appetiteValue) {
        this.name = name;
        this.appetiteValue = appetiteValue;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetiteValue=" + appetiteValue +
                ", isHungry=" + isHungry +
                '}';
    }

    public void eatFrom(Plate p) {
        try {
            p.decreaseFood(appetiteValue);
            isHungry = false;
        } catch (PlateException e) {
            System.out.println(e.getText(name));
        }
    }

}
