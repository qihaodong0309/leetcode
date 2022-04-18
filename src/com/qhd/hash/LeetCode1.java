package com.qhd.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qihaodong
 */
public class LeetCode1 {

    /**
     * 采用 HashMap 做为中间节点过滤
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }

}
