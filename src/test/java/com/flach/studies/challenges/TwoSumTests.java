package com.flach.studies.challenges;

import org.junit.Test;

import com.flach.challenges.TwoSum;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

public class TwoSumTests {
    @Test
    public void testTwoSum(){
        int[] nums = {1,2,3,2,2,6};
        int target = 7;
        int[] expected = {0,5};

        assertTrue(Arrays.equals(expected, TwoSum.twoSum(nums, target)));
    }
    @Test
    public void testTwoSum2(){
        int[] nums = {1,6};
        int target = 7;
        int[] expected = {0,1};

        assertTrue(Arrays.equals(expected, TwoSum.twoSum(nums, target)));
    }
    @Test
    public void testTwoSum3(){
        int[] nums = {6,1};
        int target = 7;
        int[] expected = {0,1};

        assertTrue(Arrays.equals(expected, TwoSum.twoSum(nums, target)));
    }
    @Test
    public void testTwoSum4(){
        int[] nums = {6,2,3,4,5,6};
        int target = 12;
        int[] expected = {0,5};

        assertTrue(Arrays.equals(expected, TwoSum.twoSum(nums, target)));
    }
    @Test
    public void testTwoSum5(){
        int[] nums = {0,2,3,4,5,0};
        int target = 0;
        int[] expected = {0,5};

        assertTrue(Arrays.equals(expected, TwoSum.twoSum(nums, target)));
    }
    @Test
    public void testTwoSum6(){
        int[] nums = {0,0};
        int target = 0;
        int[] expected = {0,1};

        assertTrue(Arrays.equals(expected, TwoSum.twoSum(nums, target)));
    }
}
