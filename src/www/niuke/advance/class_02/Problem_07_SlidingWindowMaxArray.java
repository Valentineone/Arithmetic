package www.niuke.advance.class_02;

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
			 * �������i�������qmax˫�˶��е�β��
			 *
			 * qmax�������ٻ���һ��λ��
			 * 1.�������������arr[i]��֮ǰ��qmax�е�����������
			 * 2.�����qmax��һ�����Ԫ��
			 */
			qmax.addLast(i);
			/*
			 * w = 3,i = 4ʱ
			 * λ��Ϊ 1 �ľ��ǹ���λ��
			 */
			if (qmax.peekFirst() == i - w) {
				qmax.pollFirst();
			}
			/*
			 * �� i > 2 ��ʱ����д��ڿ��ԣ����Բ��д��������ֵ����
			 */
			if (i >= w - 1) {
				/*
				 * ���ֵ������������ھ�һֱ��������ֵ������peekFirst
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
