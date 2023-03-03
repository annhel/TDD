package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    Math m;
    @Before
    public void setUp(){
        m = new Math();
    }

    @After
    public void cleanUp(){

    }

    @Test
    public void testGCF(){
        Assert.assertEquals(6, m.GCF(54, 42));
    }

    @Test
    public void testAreaRectangle(){
        Assert.assertEquals(10, m.areaRectangle(2, 5));
    }

    @Test
    public void testAreaTriangle(){
        Assert.assertEquals(15, m.areaTriangle(10, 3), .1);
    }

    @Test
    public void testAreaCircle(){
        Assert.assertEquals(314.16, m.areaCircle(10), .1);
    }

    @Test
    public void testFactorial(){
        Assert.assertEquals(-1, m.factorial(-4));
        Assert.assertEquals(1, m.factorial(0));
        Assert.assertEquals(5040, m.factorial(7));
    }

}
