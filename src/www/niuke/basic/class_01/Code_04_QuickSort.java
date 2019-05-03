package www.niuke.class_01;

import java.util.Arrays;

public class Code_04_QuickSort {

	public static void quickSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			swap(arr, left + (int) (Math.random() * (right - left + 1)), right);//随即一个数和right交换，让right作为比较的数
			int[] p = partition(arr, left, right);
			quickSort(arr, left, p[0]);
			quickSort(arr, p[1], right);
		}
	}

	public static int[] partition(int[] arr, int left, int right) {
		int less = left - 1;
		int more = right;
		while (left < more) {
			if (arr[left] < arr[right]) {
				swap(arr, ++less, left++);
				/*
				* 若是最后一句++less之后 less == left
				* ++less和自己交换 less之后都比arr[right](基准元素) 大
				*
				* ++less之后和left交换，left 比基准元素小
				* less可能和基准元素相等
				* 这取决于致之前是否执行过最后一个else
				* 执行过:之前的less区域最近的一个与基准元素相等的和left交换
				* 未执行过：++less == left自己和自己交换
				*
				* */
			} else if (arr[left] > arr[right]) {
				swap(arr, --more, left);
				/*
				* 若是最后一句 --more之后 more == left  left和自己交换
				* left在大于区域
				* less之后都比arr[right](基准元素) 大
				*
				* --more之后和left(比基准元素大)
				* --more可能和基准元素相等
				* 这取决于致之前是否执行过最后一个else
				* 执行过:之前的more区域最近的一个与基准元素相等的和left交换
				* 未执行过：--more == left，left再次变为未知的数进入下一次的while和arr[right]比较
				*
				* */
			} else {
				left++;
				/*
				* 若为最后一句 left++ 之后 left == more
				* left在大于区域
				* more区域左侧至少有一个和基准元素相等
				*
				* 之前执行过left++后left左侧为和基准元素相等的
				* 之前未执行过之前的left左侧第一个就是less
				* 执行该语句后left与less相差一个基准元素元素
				* */
			}
		}
		swap(arr, more++, right);
		/*
		* more区域第一个和more区域后的最后一个的后一个(基准元素)交换
		* 是只数组中more之后的全部是大于区域
		* */
		return new int[] { less, more };
		/*
		* 此时的more是大于区域第一个
		* less是小于区域最后一个
		*
		* 真是妙哇
		* */
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
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
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
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
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// for test
	public static void main(String[] args) {
		int testTime = 10000;
		int maxSize = 100;
		int maxValue = 100;
		boolean succeed = true;
		for (int i = 0; i < testTime; i++) {
			int[] arr1 = generateRandomArray(maxSize, maxValue);
			int[] arr2 = copyArray(arr1);
			quickSort(arr1);
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
		System.out.println("The array length is " + arr.length);
		printArray(arr);
		quickSort(arr);
		printArray(arr);

	}

}
