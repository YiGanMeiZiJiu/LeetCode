package com.leetcode.code.First.String;

import com.alibaba.fastjson.JSON;

import java.util.HashSet;

/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）
 */
public class CompressString {

    public static String compressString(String s) {
        if (s.length() <=1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int start = 0;
        int size = 1;
        StringBuffer result = new StringBuffer();
        while (start < chars.length-1) {
            System.out.println(chars[start]);
            if (start == chars.length-2) {
                if (chars[start + 1] != chars[start]) {
                    result.append(chars[start]).append(size).append(chars[start+1]).append(1);
                } else {
                    size++;
                    result.append(chars[start]).append(size);
                }
            } else {
                if (chars[start + 1] == chars[start]) {
                    size++;
                } else {
                    result.append(chars[start]).append(size);
                    size = 1;
                }
            }
            start++;
        }
        if (result.length() >= s.length())
            return s;
        else
            return result.toString();
    }

}
