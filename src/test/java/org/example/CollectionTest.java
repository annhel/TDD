package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.example.Collection.*;

public class CollectionTest {

    List<Integer> listNums;
    Set<Integer> setNums;
    Queue<String> queueStrs;

    @Before
    public void setUp(){
        listNums = new ArrayList<>();
        setNums = new TreeSet<>();
        queueStrs = new PriorityQueue<>();

        listNums.add(2);
        listNums.add(-2);
        listNums.add(5);
        listNums.add(20);
        listNums.add(15);

        setNums.add(2);
        setNums.add(-2);
        setNums.add(5);
        setNums.add(20);
        setNums.add(15);

        queueStrs.add("Red");
        queueStrs.add("Green");
        queueStrs.add("Blue");
        queueStrs.add("Magenta");
        queueStrs.add("Yellow");
    }

    @After
    public void cleanUp() {

    }

    @Test
    public void testFindMax(){
        Assert.assertEquals(20, findMax(listNums));
    }

    @Test
    public void testFindMin(){
        Assert.assertEquals(-2, findMin(listNums));
    }

    @Test
    public void testRemoveLessThan(){
        removeLessThan(setNums,6);
        Set<Integer> lessThanValues = new TreeSet<>();
        lessThanValues.add(2);
        lessThanValues.add(-2);
        lessThanValues.add(5);

        Assert.assertEquals(lessThanValues, setNums);
    }

    @Test
    public void testRemoveGreaterThan(){
        removeGreaterThan(setNums,6);
        Set<Integer> greaterThanValues = new TreeSet<>();
        greaterThanValues.add(20);
        greaterThanValues.add(15);

        Assert.assertEquals(greaterThanValues, setNums);
    }

    @Test
    public void testRemoveHalf(){
        removeHalf(queueStrs);
        Queue<String> halfStrs = new PriorityQueue<>();
        queueStrs.add("Red");
        queueStrs.add("Green");

        Assert.assertEquals(2, queueStrs.size());
    }
}
