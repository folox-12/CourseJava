package lessons.level.second.second.utils;

import lessons.level.second.second.utils.exception.MyArrayDataException;
import lessons.level.second.second.utils.exception.MyArraySizeException;

public class MappingArray {
    public static int getSummOfElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        final int maxArraySize = 4;
        int sum = 0;

        if (array.length != maxArraySize) throw new MyArraySizeException(maxArraySize);

        for (int rowNumber = 0; rowNumber < array.length; rowNumber++) {
            for (int elementNumber = 0; elementNumber < array[rowNumber].length; elementNumber++) {
                if (array[rowNumber].length != maxArraySize) throw new MyArraySizeException(maxArraySize);
                try {
                    sum += Integer.parseInt(array[rowNumber][elementNumber]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(rowNumber, elementNumber);
                }
            }
        }

        return sum;

    }

}
