package www.wangchong.java;

import java.util.Arrays;

/**
 * 1.冒泡排序
 * 2.插入排序
 * 3.直接插入排序
 * 4.希尔排序
 * 5.选择排序
 * 6.归并排
 * 分别分析这几种排序的时间、空间序复杂度以及稳定性
 */
public class AllSort {
    public static void bubbleSort(int[] arr) {
        long star = System.nanoTime();
        if (arr.length < 2) {
            return;
        }
        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1] ) {
                    swap(arr,i,i + 1);
                }
            }
        }
        long end = System.nanoTime();
        System.out.println("冒泡排序:" + (end - star) + "纳秒");
    }

    private static void selectSort(int[] arr) {
        long star = System.nanoTime();

        if (arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr,min,i);
        }
        long end = System.nanoTime();

        System.out.println("选择排序:" + (end - star) + "纳秒");

    }

    public static void mergeSort(int[] arr) {
        long star = System.nanoTime();

        if(arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr,0,arr.length - 1);
        long end = System.nanoTime();

        System.out.println("归并排序:" + (end - star) + "纳秒");

    }

    public static void mergeSort(int[] arr,int left, int right) {
        if(left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergeSort(arr,left,mid);
        mergeSort(arr,mid + 1,right);
        merge(arr,left,mid,right);


    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int[] help = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= right) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= right) {
            help[i++] = arr[p2++];
        }
        for(i = 0; i < help.length; i++) {
            arr[left++] = help[i];
        }

    }

     private static void insertSort(int[] arr) {
         long star = System.nanoTime();

         if (arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j,j-1);
                }
            }
        }
         long end = System.nanoTime();

         System.out.println("插入排序:" + (end - star) + "纳秒");

     }

    public static void binaryInsertSort(int[] arr) {
        long star = System.nanoTime();

        if (arr == null || arr.length <2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = i - 1;
            int value = arr[i];
            int j = i - 1;
            while (left <= right) { // 找到最后一定是 left == right 的情况
                int mid = left + (right - left) / 2;
                if (arr[mid] < value) {
                    left = mid + 1;
                } else if (arr[mid] > value) {
                    right = mid - 1;// right 在插入位置前面一个
                } else {
                    right = mid;// right == mid - 1 也是正确的,但是这样就不是稳定的了
                    break;
                }
            }
            for (; j > right ; j--) {
                arr[j + 1] = arr[j];//不用arr[j] = arr[j - 1] 防止数组越界,因为存在left == right == 0 的情况
            }
            arr[j + 1] = value;
        }
        long end = System.nanoTime();

        System.out.println("二分排序:" + (end - star) + "纳秒");

    }
     private static void shellSort(int[] arr) {
         long star = System.nanoTime();

         if (arr.length < 2) {
            return;
        }
        int length = arr.length;
        int step = length / 2;
        while (step > 0) {
            for (int i = step; i < length; i++) {
                int value = arr[i];
                int j = i - step;
                for (; j  >= 0; j -= step) {
                    if (value < arr[j]) {
                        arr[j + step] = arr[j];
                    } else {
                        break;
                    }
                }
                arr[j + step] = value;
            }
            step /= 2;
        }
         long end = System.nanoTime();

         System.out.println("希尔排序:" + (end - star) + "纳秒");

     }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random());
        }
        return arr;
    }


    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }



    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int maxSize = 10000;
        int maxValue = 50;
        int[] arr1 = generateRandomArray(maxSize, maxValue);
        int[] arr2 = copyArray(arr1);
        int[] arr3 = copyArray(arr1);
        int[] arr4 = copyArray(arr1);
        int[] arr5 = copyArray(arr1);
        int[] arr6 = copyArray(arr1);

        bubbleSort(arr1);
        insertSort(arr2);
        selectSort(arr3);
        binaryInsertSort(arr4);
        shellSort(arr5);
        mergeSort(arr6);

     /*   printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);
        printArray(arr5);
        printArray(arr6);
*/
    }


}
