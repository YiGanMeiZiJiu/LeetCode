package com.leetcode.code.First.String;

import com.alibaba.fastjson.JSON;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 *
 * 输入
 * hello world
 *
 * 输出
 * 5
 */
public class LastWordLength {

    public static int lastWordLength(String word) {
        if (word.length() <= 0) {
            return 0;
        }
        String[] words = word.split(" ");
        System.out.println(JSON.toJSON(words));
        if (words.length <= 0) {
            return 0;
        }
        if (words.length == 1) {
            return words[0].length();
        }
        return words[words.length-1].length();
    }

}
