package www.niuke.class_01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Code_10_GetAllNotIncluded {

	public static List<Integer> GetAllNotIncluded(int[] A, int[] B) {
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < B.length; i++) {//以谁为基准，外循环就是谁
			int l = 0;
			int r = A.length - 1;
			boolean contains = false;
			while (l <= r) {//二分查找,以B为基准，在A中二分查找
				int mid = l + ((r - l) >> 1);
				if (A[mid] == B[i]) {
					contains = true;
					break;//有相等的值了就不用加进链表
				}
				if (A[mid] > B[i]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
			if (!contains) {
				res.add(B[i]);
			}
		}
		return res;
	}

	// for test
	public static List<Integer> comparator(int[] A, int[] B) {
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < B.length; i++) {
			boolean contains = false;
			for (int j = 0; j < A.length; j++) {
				if (A[j] == B[i]) {
					contains = true;
					break;
				}
			}
			if (!contains) {
				res.add(B[i]);
			}
		}
		return res;
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
	public static boolean isEqual(List<Integer> l1, List<Integer> l2) {
		if (l1.size() != l2.size()) {
			return false;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for (Integer i : l1) {
			if (!map.containsKey(i)) {
				map.put(i, 0);
			}
			map.put(i, map.get(i) + 1);
		}
		for (Integer i : l2) {
			if (!map.containsKey(i)) {//只要有一个不存在两个List就不相等
				return false;
			}
			map.put(i, map.get(i) - 1);
			if (map.get(i) < 0) {
				return false;
			}
		}
		return true;
	}

	// for test
	public static void main(String[] args) {
		int testTime = 300000;
		int sortedArrayMaxSize = 300;
		int unsortedArrayMaxSize = 10;
		int maxValue = 100;
		boolean succeed = true;
		for (int i = 0; i < testTime; i++) {
			int[] A = generateRandomArray(sortedArrayMaxSize, maxValue);
			int[] B = generateRandomArray(unsortedArrayMaxSize, maxValue);
			Arrays.sort(A);
			List<Integer> res1 = GetAllNotIncluded(A, B);
			List<Integer> res2 = comparator(A, B);
			if (!isEqual(res1, res2)) {
				succeed = false;
				break;
			}

			/*System.out.print("Get all not included:");
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
			System.out.println();*/
		}
		System.out.println(succeed ? "Nice!" : "Fucking fucked!");

	}

}
