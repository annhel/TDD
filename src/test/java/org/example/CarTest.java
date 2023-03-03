package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    Car car;

    @Before
    public void setUp() {
        car = new Car(10, 15);
    }

    @After
    public void cleanUp() {

    }

    @Test
    public void testDrive(){
        car.drive(10);
        Assert.assertEquals(14, car.getGas(), 0.1);
        car.drive(140);
        Assert.assertEquals(0, car.getGas(), 0.1);
    }

    @Test
    public void testFill(){
        car.fill(10);
        Assert.assertEquals(25, car.getGas(), 0.1);
    }

}
