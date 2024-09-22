package lessons.sixth;

import lessons.level.third.sixth.App;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestFirstMethod {
    Integer[] items;
    Integer[] result;

    public TestFirstMethod(Integer[] result, Integer[] items) {
        this.result = result;
        this.items = items;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{1, 2}, new Integer[]{1, 2, 4, 1, 2}},
                {new Integer[]{}, new Integer[]{1, 2, 4, 1, 2, 4}},
                {new Integer[]{5, 6}, new Integer[]{1, 4, 6, 4, 5, 6}},
                {new Integer[]{1, 2, 3}, new Integer[]{1, 2, 4, 1, 2, 4, 1, 2, 3}},
        });
    }

    @Test()
    public void testMethodIsArrayIncludedNumbers() {
        Assert.assertArrayEquals(result, App.copyItemsAfterFour(items));
    }

}
