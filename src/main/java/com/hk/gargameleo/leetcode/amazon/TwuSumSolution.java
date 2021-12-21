package main.java.com.hk.gargameleo.leetcode.amazon;

import java.util.HashMap;
import java.util.Map;

public class TwuSumSolution {

    /**
     * @param nums   an integer number array
     * @param target an integer target
     * @return indices of the two numbers such that they add up to target
     */
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }

            map.put(nums[i], i);

        }

        return null;
    }

}
