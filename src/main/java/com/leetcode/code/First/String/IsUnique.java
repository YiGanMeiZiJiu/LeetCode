package com.leetcode.code.First.String;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 输入: s = "leetcode"
 * 输出: false
 *
 * 输入: s = "abc"
 * 输出: true
 */
public class IsUnique implements IIsUnique {

    public static int a = 3;

    public int b = 1;

    public boolean isUnique(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            // 每一步将一个字母替换成空，在每一步去判断，字符串的长度是减少了1还是减少了更多
            String s = astr.replace(String.valueOf(astr.charAt(i)), "");
            if (s.length()+1 < astr.length()) {
                return true;
            }
        }
        return false;
    }

    public void test() {
        System.out.println("本体方法");
    }

}
