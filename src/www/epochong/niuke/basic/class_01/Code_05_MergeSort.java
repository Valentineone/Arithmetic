package www.epochong.niuke.class_01;
// 归并排序
import java.util.Arrays;

public class Code_05_MergeSort {

    private static void mergeSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		mergeSort(arr, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int left, int right) {
		/*
		* 递归的分治，还需要回来由小的有序到大的有序
		* 有终止条件 left == right
		* 递归条件则是 left < right
		*
		*
		* 快速排序，也用了递归的思想，
		* 但没有终止条件
		* 因为在每一次都是分区域的，大于等于小于
		* 最终当递归条件left < right不满足时
		* 已经排完序了
		*
		* */
    	if (left == right) {
			return;
		}
		int mid = left + ((right - left) >> 1);//l和r中点的位置(l + r) / 2
		mergeSort(arr, left, mid);// T(n/2)
		/*
		* left -> mid 如果是奇数个 0 1 2        3 4
		* 			  如果是偶数个 0 1          2 3
		*
		* */
		mergeSort(arr, mid + 1, right);//T(N/2)
		merge(arr, left, mid, right);//O(N)
		//T(N) = 2 T(N/2) + O(N)
		//O(N*logN)
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int[] help = new int[right - left + 1];//右 减 左 就是数组中数的个数，也就是数组的长度
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
		for (i = 0; i < help.length; i++) {
			arr[left + i] = help[i];
		}
	}

	// for test
	public static void comparator(int[] arr) {
		Arrays.sort(arr);
	}

	// for test
	public static int[] generateRandomArray(int maxSize, int maxValue) {
		int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
		}
		return arr;
	}

	// for test
	public static int[] copyArray(int[] arr) {
		if (arr == null) {
			return null;
		}
		int[] res = new int[arr.length];
        System.arraycopy(arr, 0, res, 0, arr.length);
		return res;
	}

	// for test
	public static boolean isEqual(int[] arr1, int[] arr2) {
		if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
			return false;
		}
		if (arr1 == null && arr2 == null) {
			return true;
		}
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	// for test
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
		System.out.println();
	}

	// for test
	public static void main(String[] args) {
		int testTime = 500000;
		int maxSize = 100;
		int maxValue = 100;
		boolean succeed = true;
		for (int i = 0; i < testTime; i++) {
			int[] arr1 = generateRandomArray(maxSize, maxValue);
			int[] arr2 = copyArray(arr1);
			mergeSort(arr1);
			comparator(arr2);
			if (!isEqual(arr1, arr2)) {
				succeed = false;
				printArray(arr1);
				printArray(arr2);
				break;
			}
		}
		System.out.println(succeed ? "Nice!" : "Fucking fucked!");

		int[] arr = generateRandomArray(maxSize, maxValue);
		System.out.println("随机数组：");
		printArray(arr);
		mergeSort(arr);
		System.out.println("归并排序：");
		printArray(arr);

	}

}
