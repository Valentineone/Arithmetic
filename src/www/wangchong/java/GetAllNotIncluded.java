package www.wangchong.java;
/*
* 在B中找到所有不在A中的数并打印出来
* */
import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GetAllNotIncluded {
    public static List<Integer> GetAllNotIncluded(int[] arr1, int[] arr2) {
        List res = new ArrayList();
        for (int i = 0; i < arr2.length; i++) {
            boolean contains = false;
            int left = 0;
            int right = arr1.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if(arr1[mid] == arr2[i]) {
                    contains = true;
                    break;
                }
                if (arr1[mid] < arr2[i]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (!contains) {
                res.add(arr2[i]);
            }
        }
        return res;
    }

    public static List<Integer> comparator(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            boolean contains = false;
            for(int j = 0; j < arr1.length; j++) {
                if(arr1[j] == arr2[i]) {
                    contains = true;
                    break;
                }
            }
            if(!contains) {
                res.add(arr2[i]);
            }
        }
        return res;
    }
    public static boolean isEqual(List<Integer> listone, List<Integer> listtwo) {
        if(listone.size() != listtwo.size()) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i: listone
             ) {
            if(!map.containsKey(i)) {
                map.put(i,0);
            }
            map.put(i,map.get(i) + 1);
        }
        for (Integer i: listtwo
             ) {
            if(!map.containsKey(i)) {
                return false;
            }
            map.put(i,map.get(i) - 1);
            if (map.get(i) < 0) {
                return false;
            }
        }
        return true;
    }
    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
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
    // for test
    public static void main(String[] args) {
        int testTime = 3;
        int sortedArrayMaxSize = 10;
        int unsortedArrayMaxSize = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] A = generateRandomArray(sortedArrayMaxSize, maxValue);
            int[] B = generateRandomArray(unsortedArrayMaxSize, maxValue);
            Arrays.sort(A);
            System.out.print("A:");
            printArray(A);
            System.out.print("B:");
            printArray(B);
            List<Integer> res1 = GetAllNotIncluded(A, B);
            List<Integer> res2 = comparator(A, B);
            if (!isEqual(res1, res2)) {
                succeed = false;
                System.out.println("Wrong");
                break;
            }
            System.out.print("Get all not included:");
            for (Integer r1: res1
                    ) {
                System.out.print(r1 + " ");
            }
            System.out.println();
            System.out.print("Comparator:");
            for (Integer r2: res2
                 ) {
                System.out.print(r2 + " ");
            }
            System.out.println();
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

    }
}
