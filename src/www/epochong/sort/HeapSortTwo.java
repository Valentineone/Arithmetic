package www.epochong.sort;

/**
 * @author epochong
 * @date 2019/8/25 17:17
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class HeapSortTwo {
    public static void heapSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr,i);
        }
    }
    public static void heapInsert(int[] arr, int index) {
        if (arr[index] > arr[(index - 1) / 2]) {
            swap(arr,index,(index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
