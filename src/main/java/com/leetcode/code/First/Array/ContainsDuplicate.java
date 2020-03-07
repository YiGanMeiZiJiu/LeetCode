package com.leetcode.code.First.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 输入: [1,2,3,1]
 * 输出: true
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        // 借用set，前后倒放一次
        Set set = new HashSet();
        for (int temp : nums) {
            boolean result = set.add(temp);
            if (!result) {
                return true;
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        int[] nums = new int[] {1,2,3,4};
//        System.out.println(containsDuplicate(nums));
//    }
}