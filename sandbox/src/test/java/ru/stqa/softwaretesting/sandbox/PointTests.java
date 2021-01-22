package ru.stqa.softwaretesting.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testArea() {
        Point p = new Point(4,22,1,33);
        Assert.assertEquals(p.area(), 11.40175425099138);
    }
}
