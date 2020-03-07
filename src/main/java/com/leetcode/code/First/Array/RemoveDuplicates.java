package com.leetcode.code.First.Array;

import com.alibaba.fastjson.JSON;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 从排序数组中删除重复项
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        // 数组长度为0，直接输出
        if (nums.length <= 0) {
            return 0;
        }
        Set temp = new LinkedHashSet();
        int size = 0;
        // 将数组中值遍历塞进SET
        for (int number : nums) {
            boolean isDouble = temp.add(number);
            if (isDouble) {
                size++;
            }
        }
        Integer[] result = new Integer[size];
        temp.toArray(result);
        // 更新原数组的值
        for (int i = 0; i < size; i++) {
            nums[i] = result[i];
            System.out.println(nums[i]);
        }
        return size;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
