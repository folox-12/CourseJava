package lessons.sixth;

import lessons.level.third.sixth.App;
import org.junit.Assert;
import org.junit.Test;

public class TestSecondMethod {
    @Test
    public void testIsTrue() {
        Assert.assertTrue(App.isArrayIncluedNumbers(new Integer[]{1, 2, 3, 4, 5}));
        Assert.assertTrue(App.isArrayIncluedNumbers(new Integer[]{4, 4, 1, 2, 3, 5}));
        Assert.assertTrue(App.isArrayIncluedNumbers(new Integer[]{1, 2, 4, 3, 5}));
    }

    @Test
    public void testIsFalse() {
        Assert.assertFalse(App.isArrayIncluedNumbers(new Integer[]{1, 2, 3, 5}));
        Assert.assertFalse(App.isArrayIncluedNumbers(new Integer[]{2, 3, 5}));
        Assert.assertFalse(App.isArrayIncluedNumbers(new Integer[]{4, 4, 2, 3, 5}));
        Assert.assertFalse(App.isArrayIncluedNumbers(new Integer[]{2, 4, 3, 5}));
    }
}
