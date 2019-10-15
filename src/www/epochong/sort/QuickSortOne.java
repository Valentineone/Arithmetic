package www.epochong.sort;

import java.util.Arrays;

public class QuickSortOne {
    public static void quickSort(int
                                 [] arr) {
        if (arr.length < 2) {
           return;
        }
        quickSort(arr,0,arr.length - 1);
    }
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            swap(arr,right,left + (int) (Math.random() * (right - left + 1)));
            int[] p = partition(arr,left,right);
            quickSort(arr,left,p[0]);
            quickSort(arr,p[1],right);
        }
    }
    public static int[] partition(int[] arr, int left, int right) {
        int less = left - 1;
        int more = right;
        while (left < more) {
            if (arr[left] < arr[right]) {
                swap(arr,++less,left++);
            } else if (arr[left] > arr[right]) {
                swap(arr,--more,left);
            } else {
                left++;
            }
        }
        swap(arr,more++,right);
        return new int[]{less,more};
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if(arr1 == null && arr2 != null || arr1 != null && arr2 == null) {
            return false;
        }
        if(arr2 == null) {
            return true;
        }
        if(arr1.length != arr2.length) {
            return false;
        }
        for (int i =0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] copyArray(int[] arr) {
        if(arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        System.arraycopy(arr, 0, res, 0, arr.length);
        return res;
    }

    public static void printArray(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }

    public static int[] generateRandomArray(int maxSize, int maxValue){
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random() - (int)((maxValue + 1) * Math.random()));
        }
        return arr;
    }
    public static void main(String[] args) {
        int testTime = 50;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for(int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize,maxValue);
            int[] arr2 = copyArray(arr1);
            quickSort(arr1);
            comparator(arr2);
            if(!(isEqual(arr1, arr2))) {
                succeed = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Your quick sort is right" : "Your quick sort is wrong");
        int[] arr = generateRandomArray(maxSize,maxValue);
        quickSort(arr);
        for (int e: arr
             ) {
            System.out.print(e + " ");
        }
    }
}

