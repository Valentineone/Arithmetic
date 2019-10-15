package www.epochong.niuke.advance.class_02;

import java.util.LinkedList;

public class Problem_07_SlidingWindowMaxArray {

	public static int[] getMaxWindow(int[] arr, int w) {
		if (arr == null || w < 1 || arr.length < w) {
			return new int[0];
		}
		LinkedList<Integer> qmax = new LinkedList<Integer>();
		int[] res = new int[arr.length - w + 1];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
				qmax.pollLast();
			}
			/*
			 * 无论如何i都会加入qmax双端队列的尾部
			 *
			 * qmax队列最少会有一个位置
			 * 1.这种情况是由与arr[i]比之前的qmax中的所有数都大
			 * 2.亦或是qmax第一次添加元素
			 */
			qmax.addLast(i);
			/*
			 * w = 3,i = 4时
			 * 位置为 1 的就是过期位置
			 */
			if (qmax.peekFirst() == i - w) {
				qmax.pollFirst();
			}
			/*
			 * 当 i > 2 的时候才有窗口可言，所以才有窗口内最大值可言
			 */
			if (i >= w - 1) {
				/*
				 * 最大值不更新这个窗口就一直是这个最大值所以是peekFirst
				 */
				res[index++] = arr[qmax.peekFirst()];
			}
		}
		return res;
	}

	// for test
	public static void printArray(int[] arr) {
		for (int i = 0; i != arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 5, 4, 3, 3, 6, 7 };
		int w = 3;
		printArray(getMaxWindow(arr, w));

	}

}
