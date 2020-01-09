package com.hdt.ctest.craft.classic;

import java.util.ArrayList;

/**
 * @author hdtpjhz@163.com
 * @date 2020-01-08 13:44
 * @use a
 * 动态规划
 * https://mp.weixin.qq.com/s?__biz=MzUyNjQxNjYyMg==&mid=2247486904&idx=1&sn=099d5560ab25c0163349dff0c7f51490&chksm=fa0e6239cd79eb2fe6e831d7debba60aa906721d592b8766a944ef88bf91bf82568c20d71891&scene=21#wechat_redirect
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    /**
     * 斐波那契数列；
     * f(n) = f(n-1) + f(n-2)
     *
     * @param
     * @return
     */
    public static int fibonacci(int n) {
        int[] data = new int[n + 1];
        data[0] = 0;
        data[1] = 1;
        for (int i = 2; i <= n; i++) {
            data[i] = data[i - 1] + data[i - 2];
        }
        return data[n];
    }

    /**
     * LeetCode 第 120 号问题：三角形最小路径和。
     *
     * @param triangle
     * @return
     */
    public static int getBetterLine(ArrayList<ArrayList<Integer>> triangle) {
        int n = triangle.size();
        int[][] data = new int[n][n];

        ArrayList<Integer> lastRow = triangle.get(n - 1);
        for (int j = 0; j < n; j++) {
            data[n - 1][j] = lastRow.get(j);
        }

        for (int i = n - 2; i >= 0; i--) {
            ArrayList<Integer> row = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                data[i][j] = Math.min(data[i + 1][j], data[i + 1][j + 1]) + row.get(j);
            }
        }

        return data[0][0];
    }

    /**
     * LeetCode 第 53 号问题：最大子序和。
     * 贪心、分致、动态规划；
     * 求：子数组最大和
     * @param array
     * @return
     */
    public static int getMaxSumInArray(int[] array) {
        int length = array.length;
        int[] dp = new int[length];
        dp[0] = array[0];
        int result = dp[0];
        for (int i = 1; i < length; i++) {
            dp[i] = Math.max(dp[i - 1], 0) + array[i];
            result = Math.max(dp[i], result);
        }
        return result;
    }
}
