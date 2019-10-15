package www.epochong.java7;

import java.util.Arrays;
import java.util.Random;

public class SortHelper {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
    public static int[] generateArray(int n, int rangeL,int rangeR) {
        int arr[] = new int[n];
        if (rangeL > rangeR) {
            throw new IllegalArgumentException("范围非法");
        } else {
            for (int i = 0; i < n; i++) {
                arr[i] = new Random().nextInt((rangeR - rangeL + 1) + rangeL);
            }
            return arr;
        }
    }
    public static  int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr,arr.length);
    }
    public static int[] generateNearlySortedArray(int n, int swapTimes) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < swapTimes; i++) {
            swap(arr,(int) (Math.random() * n),(int) (Math.random() * n));
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
