package www.epochong.niuke.basic.class_01;
//堆排序
import java.util.Arrays;

public class Code_03_HeapSort {

	public static void heapSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			//构建大根堆
			heapInsert(arr, i);
		}
		int size = arr.length;
		//交换根结点和最后一个结点，破坏了大根堆的结构
		swap(arr, 0, --size);
		//不断重复交换根结点和最后一个节点，并且每交换一次要进行一次重建堆的过程，交换的根结点不包含在内
		while (size > 0) {
			heapify(arr, 0, size);
			swap(arr, 0, --size);
		}
	}
	/*
	*                       0
	*                1              2
	*            3       4        5   6
	*          7   8   9   10
	*
	*  (index - 1) / 2 是父结点的位置
	*  0 的父结点是自己
	*
	* */
	/**
	 * 从下向上建立大根堆
	 */
	public static void heapInsert(int[] arr, int index) {

		//当当前结点大于他的父节结点就交换位置，因为传过来的是当前结点，然后不断的向上
		while (arr[index] > arr[(index - 1) / 2]) {
			swap(arr, index, (index - 1) / 2);
			//大的数一步步向上到自己原来父结点的位置
			index = (index - 1) / 2;
		}
	}
	/**
	 * 	交换首尾之后重建堆的过程，重建堆的时候小值顺着较大子树下去，最后一个位置的数不参与交换
	 * 	index初值总是为0，size的位置正好为根结点交换的位置，并且下面的操作以size为边界，并不包括size
	 */
	public static void heapify(int[] arr, int index, int size) {
		int left = index * 2 + 1;
		//index 左右子树都全 或 只有左子树
		while (left < size) {
			//左右子树都全，且右子树大时，下标为右。不全，或左大，则为左
			int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
			//largest指向父结点和左右子树中较大值的下标
			largest = arr[largest] > arr[index] ? largest : index;
			//如果较大值不在子树而是父节点说明index已经到了正确的位置，不需要继续向下沉
			if (largest == index) {
				break;
			}
			//下沉操作:如果较大值在孩子中，就和父结点交换
			swap(arr, largest, index);
			index = largest;
			left = index * 2 + 1;
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void comparator(int[] arr) {
		Arrays.sort(arr);
	}

	public static int[] generateRandomArray(int maxSize, int maxValue) {
		int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
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
		int testTime = 500000;
		int maxSize = 100;
		int maxValue = 100;
		boolean succeed = true;
		for (int i = 0; i < testTime; i++) {
			int[] arr1 = generateRandomArray(maxSize, maxValue);
			int[] arr2 = copyArray(arr1);
			heapSort(arr1);
			comparator(arr2);
			if (!isEqual(arr1, arr2)) {
				succeed = false;
				break;
			}
		}
		System.out.println(succeed ? "Nice!" : "Fucking fucked!");

		int[] arr = generateRandomArray(maxSize, maxValue);
		printArray(arr);
		heapSort(arr);
		printArray(arr);
	}

}
