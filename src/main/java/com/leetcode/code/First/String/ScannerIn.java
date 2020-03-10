package com.leetcode.code.First.String;

import java.util.Scanner;

public class ScannerIn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer inputTemp = new StringBuffer();
        while (in.hasNext()) {
            inputTemp.append(in.next());
        }
        String input = inputTemp.toString();
        System.out.println(input);
//        String input = "123#/22/2";
        System.out.println(scannerIn(input));
    }

    public static String scannerIn(String input) {
        if (input.length() <= 0) {
            return null;
        }
        char[] inputs = input.toCharArray();
        // 0为数字模式，1为英文模式
        int inputMode = 0;

        int i = 0;
        StringBuffer buffer = new StringBuffer();
        while (i < inputs.length-1) {
            if (inputs[i] == '#') {
                inputMode = dealInputMode(inputMode);
                i++;
                continue;
            }
            if (inputMode == 0) {
                // 数字模式
                buffer.append(inputs[i]);
                i++;
                continue;
            }
            int j = i;
            int result = 1;
            while (j < inputs.length - 1 && inputs[j] == inputs[j+1]) {
                result++;
                j++;
                i = j;
            }
//            System.out.println(result+"-"+inputs[i]);
            // 英文模式
            buffer.append(dealResult(inputs[i], result));
//            System.out.println(buffer);
            i++;
        }
        if (inputs[i] != inputs[i-1] && inputs[i] != '#' && inputs[i] != '/') {
            // 最后一位不等于倒数第二位，循环中未处理，额外单独处理,如相等，while循环中已处理
            if (inputMode == 0) {
                buffer.append(inputs[i]);
            } else {
                buffer.append(dealResult(inputs[i], 1));
            }
        }
        return buffer.toString();
    }

    public static int dealInputMode(int mode) {
        if (mode == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String dealResult(char temp, int size) {
        switch (temp) {
            case '1':
                size = size % 2;
                if (size == 1) {
                    return ",";
                } else {
                    return ".";
                }
            case '2':
                size = size % 3;
                if (size == 1) {
                    return "a";
                } else if (size == 2) {
                    return "b";
                } else {
                    return "c";
                }
            case '3':
                size = size % 3;
                if (size == 1) {
                    return "d";
                } else if (size == 2) {
                    return "e";
                } else {
                    return "f";
                }
            case '4':
                size = size % 3;
                if (size == 1) {
                    return "g";
                } else if (size == 2) {
                    return "h";
                } else {
                    return "i";
                }
            case '5':
                size = size % 3;
                if (size == 1) {
                    return "j";
                } else if (size == 2) {
                    return "k";
                } else {
                    return "l";
                }
            case '6':
                size = size % 3;
                if (size == 1) {
                    return "m";
                } else if (size == 2) {
                    return "n";
                } else {
                    return "o";
                }
            case '7':
                size = size % 4;
                if (size == 1) {
                    return "p";
                } else if (size == 2) {
                    return "q";
                } else if (size == 3) {
                    return "r";
                } else {
                    return "s";
                }
            case '8':
                size = size % 3;
                if (size == 1) {
                    return "t";
                } else if (size == 2) {
                    return "u";
                } else {
                    return "v";
                }
            case '9':
                size = size % 3;
                if (size == 1) {
                    return "w";
                } else if (size == 2) {
                    return "x";
                } else if (size == 3) {
                    return "y";
                } else {
                    return "z";
                }
            case '/':
                return "";
            default:
                return "";
        }
    }

}
