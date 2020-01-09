package com.hdt.ctest.craft.sort;

/**
 * @author hdtpjhz@163.com
 * @date 2020-01-08 15:52
 * @use a
 */
public class Test {

    public static void main(String[] args) {

        int[] data = {1,6,9,3,8,7,2,4,5};
        data = bubble(data);
        for(int x: data){
            System.out.println(x);
        }
    }

    /**
     * 冒泡排序走一波啊，从小到大排；
     * @param array
     * @return
     */
    public static int[] bubble(int[] array) {
        int length = array.length;
        for(int j = length;j>=1;j--){
            for (int i = 1; i < j; i++) {
                if (array[i - 1] > array[i]) {
                    //交换 i 和 i-1
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }


}
