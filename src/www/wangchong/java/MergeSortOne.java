package www.wangchong.java;

import java.util.Arrays;

public class MergeSortOne {
    private static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        mergeSort(arr,0,arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid + 1,right);
        merge(arr,left,mid,right);
    }

    private static void merge(int[] arr, int left, int mid,int right) {
        int[] help = new int[right - left +1];
        int p1 = left;
        int p2 = mid + 1;
        int i = 0;
        while (p1 <= mid && p2 <= right) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= right) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[left + i] = help[i];
        }
    }

    public static void compartator(int[] arr) {
        Arrays.sort(arr);
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if(arr1.length != arr2.length) {
            return false;
        }
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] generateRandomArray(int maxSize, int valueSize) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((valueSize + 1) * Math.random()) - (int) ((valueSize + 1) * Math.random());
        }
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        if(arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int maxSize = 100;
        int valSize = 100;
        int textTime = 5000;
        boolean succeed = true;
        for(int i = 0; i < textTime; i++) {
            int[] arr1 = generateRandomArray(maxSize,valSize);
            int[] arr2 = copyArray(arr1);
            mergeSort(arr1);
            compartator(arr2);
            if(!(isEqual(arr1, arr2))) {
                succeed = false;
                break;
            }
        }

        System.out.println(succeed ? "Your merge sort is right" : "Your merge sort is wrong");
        int[] arr = generateRandomArray(maxSize,valSize);
        mergeSort(arr);
        for (int e: arr
             ) {
            System.out.print(e + " ");
        }
    }
}
