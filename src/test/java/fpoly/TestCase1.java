package fpoly;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TestCase1 {
    @Test
    public void testCase1Method1() {
        Assert.assertTrue(true);
    }

    @Test
    public void testCase1Method2() {
        Assert.assertEquals(2 + 2, 4);
    }
}
