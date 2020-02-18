package com.hdt.ctest.craft.classic;

import java.util.Arrays;

/**
 * @author hdtpjhz@163.com
 * @date 2020-01-21 15:49
 * @use https://mp.weixin.qq.com/s?__biz=MzUyNjQxNjYyMg==&mid=2247486936&idx=1&sn=27ec53c1463384edeeee138db23c1c7d
 * &chksm=fa0e6259cd79eb4f240786ad7c00dcd0ed39ad68fd62b72e15d6a8ee0ecbd26b6250ab3b1171&scene=21#wechat_redirect
 */
public class ArrayTest {

    public static void main(String[] args) {

    }

    /**
     * 求数组中最长的增长子序列长度
     *
     * @param nums 目标数组
     * @return 子序列长度；
     */
    public static int maxGrowLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }


        return max;
    }
}
