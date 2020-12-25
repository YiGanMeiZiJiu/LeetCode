package com.leetcode.code.First.String;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashSet;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqChar {

    public static int firstUniqChar(String s) {
        if (s.length() <= 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }

        char[] chars = s.toCharArray();
        HashSet set = new HashSet();
        for (int i = 0; i < chars.length; i++) {
            if (!set.add(chars[i])) {
                continue;
            }
            String s1 = s.replace(String.valueOf(chars[i]), "");
            if (s1.length() + 1 == s.length()) {
                return i;
            }
            set.add(chars[i]);
        }
        return  -1;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
//        String s = "leetcode";
//        System.out.println(firstUniqChar(s));

        // 反射
//        Class isUnique = Class.forName("com.leetcode.code.First.String.IsUnique");
//        System.out.println(JSON.toJSON(isUnique.getFields()));

        // aop
        IIsUnique is = new IsUnique();
        InvocationHandler handle = new IsUniqueProxy<IIsUnique>(is);

        IIsUnique isProxy = (IIsUnique) Proxy.newProxyInstance(IsUnique.class.getClassLoader(), new Class<?>[]{IIsUnique.class}, handle);
        //执行目标方法
        isProxy.test();
    }

}
