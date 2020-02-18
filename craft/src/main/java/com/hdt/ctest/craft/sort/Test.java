package com.hdt.ctest.craft.sort;

/**
 * @author hdtpjhz@163.com
 * @date 2020-01-08 15:52
 * @use a
 */
public class Test {

    public static void main(String[] args) {

        int[] data = {0,20, 1, 9, 3, 7, 10086, 5, 3, 2, 1, 6, 3};
        data = quickSortB(data, 0, data.length - 1);
        for (int x : data) {
            System.out.println(x);
        }
    }

    /**
     * 冒泡排序走一波啊，从小到大排；
     *
     * @param array
     * @return
     */
    public static int[] bubble(int[] array) {
        int length = array.length;
        for (int j = length; j >= 1; j--) {
            for (int i = 1; i < j; i++) {
                if (array[i - 1] > array[i]) {
                    //交换 i 和 i-1
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static int[] quickSortA(int[] array, int low, int high) {
        if (low < high) {
            int pivot = part(array, low, high);
            quickSortA(array, low, pivot - 1);
            quickSortA(array, pivot + 1, high);
        }
        return array;
    }

    /**
     * @param array
     * @param low
     * @param high
     * @return
     */
    private static int part(int[] array, int low, int high) {
        int refer = array[low];
        while (low < high) {
            while (array[high] >= refer && high > low) {
                high--;
            }
            array[low] = array[high];
            while (array[low] <= refer && high > low) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = refer;
        return low;
    }


    public static int[] quickSortB(int[] array, int low, int high) {
        if (low < high) {
            int refer = array[low];
            int tempLow = low;
            int tempHigh = high;
            while (tempLow < tempHigh) {
                while (tempHigh > tempLow && array[tempHigh] >= refer) {
                    tempHigh--;
                }
                while (tempHigh > tempLow && array[tempLow] <= refer) {
                    tempLow++;
                }
                int temp = array[tempHigh];
                array[tempHigh] = array[tempLow];
                array[tempLow] = temp;
            }
            array[low] = array[tempLow];
            array[tempLow] = refer;

            //递归中轴左侧的数组
            quickSortB(array, low, tempHigh - 1);
            //递归中轴右侧的数组
            quickSortB(array, tempHigh + 1, high);
        }

        return array;
    }
}
