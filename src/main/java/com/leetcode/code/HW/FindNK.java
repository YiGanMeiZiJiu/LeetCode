package com.leetcode.code.HW;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 小王
 * Date: 2020-12-24
 * Time: 20:03
 * Description:
 */
public class FindNK {

//    private static HashSet<Integer> set = new HashSet<>();
//
//    public static int count = 0;
//
//    public List<List<Integer>> res = new ArrayList<>();


//    @Test
//    public void getPermutation() {
//        int n = 3; int k = 3;
//
//        int[] sequence = new int[n];
//        for(int i = 0; i < n; i++)
//            sequence[i] = i+1;
//
//        count = k;
//        List<Integer> path = new ArrayList<>();
//        backtrack(sequence, path);
//        System.out.println(">>>>>>"+JSON.toJSON(res));
//    }
//
//    private LinkedList<Integer> pinJie(int n, int k, LinkedList<Integer> l) {
//
//        int temp = 0;
//        if (l.size() == n) {
//            // 已经选齐了
//            temp++;
//            if (temp == k) {
//                return l;
//            }
//        }
//
//        for (int i = 1; i <= n; i++) {
//            if (!set.add(i)) {
//                continue;
//            }
//            l.push(i);
//            LinkedList<Integer> result = pinJie(n, k, l);
//            set.remove(i);
//            l.pop();
//            if (result != null) {
//                return result;
//            }
//            System.out.println(JSON.toJSON(l));
//        }
//        return null;
//    }
//
//    private void backtrack(int[] array, List<Integer> list) {
//        if (array.length == list.size()) {
//            if (count == 0) {
//                res.add(new ArrayList<>(list));
//            } else {
//                count--;
//            }
//            return;
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (!list.contains(array[i])) {
//                list.add(array[i]);
//                backtrack(array, list);
//                list.remove(list.size()-1);
//            }
//        }
//    }

    public LinkedList<LinkedList<Integer>> res = new LinkedList<>();
    public int count = 0;

    public int temp = 0;

    @Test
    public void getPermutation() {
        int n = 3; int k = 3;

        int[] sequence = new int[n];
        for(int i = 0; i < n; i++)
            sequence[i] = i+1;

        count = k;
        LinkedList<Integer> path = new LinkedList<>();
        backtrack(sequence, path);

        System.out.println(toStr(res.get(0)));
    }

    private void backtrack(int[] sequence,  LinkedList<Integer> path) {
        System.out.println("?????"+temp++);
        if(path.size() == sequence.length)
        {
            if(count == 0)
                res.add(new LinkedList<>(path));
            else
                count--;
            System.out.println(">>>>"+path.toString());
            return;
        }

        for(int i = 0; i < sequence.length; i++) {
            if(!path.contains(sequence[i]))
            {
                path.add(sequence[i]);
                backtrack(sequence, path);
                path.remove(path.size()-1);
                System.out.println(i+"===="+path.toString());
            }
        }
    }

    private static String toStr(List<Integer> path) {
        StringBuilder sb = new StringBuilder();
        for(int i =  0; i < path.size(); i++)
            sb.append(path.get(i));
        return sb.toString();
    }

}
