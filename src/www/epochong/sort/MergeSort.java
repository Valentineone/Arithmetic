package www.epochong.sort;

import java.util.Arrays;


        public class MergeSort {
            public static void mergeSort(int[] arr) {
                if(arr == null || arr.length < 2) {
                    return;
                }
        mergeSort(arr,0,arr.length - 1);
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
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if(arr1 == null && arr2 == null) {
            return true;
        }
        if(arr1.length != arr2.length) {
            return false;
        }
        for(int i =0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)((maxValue + 1) * Math.random()) - (int) ((maxValue + 1) * Math.random());
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        if(arr == null) {
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] compyArray(int[] arr) {
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
        int maxValue = 50;
        int testTime = 1000;
        boolean succeed = true;
        for(int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize,maxValue);
            int[] arr2 = compyArray(arr1);
            mergeSort(arr1);
            comparator(arr2);
            if(!(isEqual(arr1,arr2))) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Your merge sort is right!" : "Your merge sort is wrong!");

        int[] arr = generateRandomArray(maxSize,maxValue);
        System.out.println("The array length is " + arr.length);
        printArray(arr);
        mergeSort(arr);
        printArray(arr);

    }

}