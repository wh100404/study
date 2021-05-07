package com.ctks.Day2_5;

public class PingPang {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        String[] arr1 = {"x", "y", "z"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == "a" && (arr1[j] == "x" || arr1[j] == "y")) {
                    continue;
                } else if (arr[i] == "c" && (arr1[j] == "x" || arr1[j] == "z")) {
                    continue;
                } else if (arr[i] == "b" && (arr1[j] == "y" || arr1[j] == "z")) {
                    continue;
                } else {
                    System.out.println("与" + arr[i] + "比赛的是" + arr1[j]);
                }
            }
        }
    }
}
