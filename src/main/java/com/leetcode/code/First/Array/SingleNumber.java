package com.leetcode.code.First.Array;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        // 暴力法
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    temp++;
                }
                if (temp == 1 && j == nums.length-1) {
                    System.out.println(i+"-"+j+"-"+temp);
                    return nums[i];
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,2,1};
        System.out.println(singleNumber(nums));
    }

}
