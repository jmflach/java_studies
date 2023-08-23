package com.flach.challenges;

import java.util.HashMap;

public class TwoSum {
    
    public static int[] twoSum (int[] nums, int target) {
        return solution2(nums, target);
    }

    private static int[] solution1(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }
        return new int[] {};
    }

    private static int[] solution2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer current;

        for (int i = 0; i < nums.length; i++) {
            current = map.get(target - nums[i]);
            if (current != null) return new int[] {current, i};
            else map.put(nums[i], i);  
        }
        return new int[] {};
    }
}
