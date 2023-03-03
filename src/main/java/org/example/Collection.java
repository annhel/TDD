package org.example;

import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Collection {
    /**
     * Given a list of integers, return the highest integer
     * @param numbers - a list of integers
     * @return the largest integer
     */
    public static int findMax(List<Integer> numbers) {
        int max = numbers.stream().mapToInt(n -> n).max().orElse(-1);
        return max;
    }

    /**
     * Given a list of integers, return the lowest integer
     * @param numbers - a list of integers
     * @return the smallest integer
     */
    public static int findMin(List<Integer> numbers) {
        int least = numbers.stream().mapToInt(n -> n).min().orElse(-1);
        return least;
    }

    /**
     * Given a set of integers, remove all integers which are less than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeLessThan(Set<Integer> numbers, int target) {
        Set<Integer> lessThanNums = numbers.stream().filter(n -> n < target).collect(Collectors.toSet());
        numbers.removeAll(numbers);
        numbers.addAll(lessThanNums);
    }

    /**
     * Given a set of integers, remove all integers which are greater than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeGreaterThan(Set<Integer> numbers, int target) {
        Set<Integer> greaterThanNums = numbers.stream().filter(n -> n > target).collect(Collectors.toSet());
        numbers.removeAll(numbers);
        numbers.addAll(greaterThanNums);
    }

    /**
     * Given a queue of strings, remove half of all strings
     * Specifically, the size of the queue after the method is invoked should be equal to
     * floor(N/2) where N is the original size
     * @param strings - the queue of strings to mutuate
     */
    public static void removeHalf(Queue<String> strings) {
        while(strings.size() != strings.size()/2){
            strings.remove();
        }
    }
}
