package www.epochong.java7;

import static www.epochong.sort.BubbleSortone.swap;

public class AllSort {

    public static void bubbleSort(int[] arr) {
        if (arr. length < 2) {
            return;
        }
        long start = System.currentTimeMillis();
        for (int e = arr.length - 1;e > 0; e--) {
            boolean flag = false;
            for (int i= 0; i < arr.length; i++) {
                if (arr[i] > arr[i + 1] ){
                    flag = true;
                    swap(arr,i,i + 1);
                }

            }
            if (!flag) {
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序" + (end - start) + "毫秒");
    }


}
