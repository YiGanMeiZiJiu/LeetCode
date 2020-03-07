package com.leetcode.code.First.Array;

import com.alibaba.fastjson.JSON;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释: 
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 */
public class Rotate {

    public static void rotate(int[] nums, int k) {
        // 暴力法
        int length = nums.length;
        if (k == length || length <= 1) {
            System.out.println(JSON.toJSON(nums));
            return;
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = nums[i];
        }
        for (int i = 0; i < length; i++) {
//            if (i+k < length)
//                nums[i + k] = result[i];
//            else
//                nums[i + k - length] = result[i];
            int size = (i+k) % length;
            nums[size] = result[i];
        }
//        nums = result;
        System.out.println(JSON.toJSON(nums));
    }

//    public static void main(String[] args) {
//        int[] nums = new int[] {1,2};
//        int k = 3;
//        rotate(nums, k);
//    }

}
