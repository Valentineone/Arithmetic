package www.jisuanke.base;

import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/4/25 17:11
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_09_Sort {
    public static void upSort(int[] arr, int left, int right) {
        if (arr.length < 2) {
            return;
        }
        for (int i = left - 1; i < right; i++) {
            for (int j = i; j > left - 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j,j - 1);
                }
            }
        }
    }

    public static void downSort(int[] arr, int left ,int right) {
        if (arr.length < 2) {
            return;
        }
        for (int i = left - 1; i < right; i++) {
            for (int j = i; j > left - 1; j--) {
                if (arr[j] > arr[j - 1]) {
                    swap(arr,j,j - 1);
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int l1 = input.nextInt();
        int r1 = input.nextInt();
        int l2 = input.nextInt();
        int r2 = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        upSort(arr,l1,r1);
        downSort(arr,l2,r2);
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
