package lessons.level.second.second.utils.exception;

public class MyArraySizeException extends Exception {
    private int arraySize;

    public MyArraySizeException(int arraySize) {
        super();
        this.arraySize = arraySize;
    }

    @Override
    public String getMessage() {
        return"Небходимые размер массива " + arraySize;
    }
}

