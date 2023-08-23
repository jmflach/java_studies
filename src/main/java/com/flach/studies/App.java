package com.flach.studies;

import com.flach.sort.InsertionSort;
import com.flach.challenges.TwoSum;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int[] my_array = {9,4,2,3,1,0,5,7,6,8};

        InsertionSort my_InsertionSort = new InsertionSort(my_array);

        System.out.println(Arrays.toString(my_InsertionSort.array));

        my_InsertionSort.sort();

        System.out.println(Arrays.toString(my_InsertionSort.array));

        int[] nums;

        nums = TwoSum.twoSum(new int[] {1,2,3,4,5,6}, 7);

        System.out.println(Arrays.toString(nums));

        testTwoSum4();

        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

        map.put(1, 5);

        Integer r;
        r = map.get(1);
        System.out.println(r);
        r = map.get(4);
        System.out.println(map.get(4));
    }

    public static void testTwoSum4(){
        int[] nums = {6,2,3,4,5,6};
        int target = 12;
        int[] expected = {0,5};
        int[] r;
        
        r = TwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(r));
    } 
}
