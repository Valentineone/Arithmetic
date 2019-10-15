package www.epochong.niuke.class_01;

public class Code_08_NetherlandsFlag {

	public static int[] partition(int[] arr, int left, int right, int p) {
		int less = left - 1;
		int more = right + 1;
		while (left < more) {
			if (arr[left] < p) {
				swap(arr, ++less, left++);
			} else if (arr[left] > p) {
				swap(arr, --more, left);
			} else {
				left++;
			}
		}
		return new int[] { less, more };
	}

	// for test
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// for test
	public static int[] generateArray() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 3);
		}
		return arr;
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

	public static void main(String[] args) {
		int[] test = generateArray();
		printArray(test);
		int[] res = partition(test, 0, test.length - 1, 1);
		printArray(test);
		System.out.println("The last of red flag :" + res[0]);
		System.out.println("The first of blue :" + res[1]);
	}
}
