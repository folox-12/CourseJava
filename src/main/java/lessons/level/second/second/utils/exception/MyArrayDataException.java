package lessons.level.second.second.utils.exception;

public class MyArrayDataException extends Exception {
    private int rowIndex, elementNumber;

    public MyArrayDataException(int rowIndex, int elementNumber) {
        super();
        this.rowIndex = rowIndex;
        this.elementNumber = elementNumber;
    }

    @Override
    public String getMessage() {
        return "Неверные данные в ячейке [" + rowIndex + "]" + "[" + elementNumber + "]";
    }
}
