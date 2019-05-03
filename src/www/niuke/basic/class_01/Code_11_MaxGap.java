
package www.niuke.class_01;
/*
* 3-100
* 补充问题
* 给定一个数组，求如果排序之后，相邻两数的最大差值，要求时
* 间复杂度O(N)，且要求不能用非基于比较的排序。
*
* 年年都考
* */
import java.util.Arrays;

public class Code_11_MaxGap {

	private static int maxGap(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		int len = nums.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int num : nums) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		if (min == max) {
			return 0;
		}
		//每个桶的信息
		boolean[] hasNum = new boolean[len + 1];//N+1
		int[] maxs = new int[len + 1];
		int[] mins = new int[len + 1];
		int bid;
		for (int num : nums) {//重新遍历数组
			bid = bucket(num, len, min, max);//确定数在哪个桶
			mins[bid] = hasNum[bid] ? Math.min(mins[bid], num) : num;
			maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], num) : num;
			hasNum[bid] = true;//这个桶有数
		}
		int res = 0;
		int lastMax = maxs[0];
		for (int i = 1; i <= len; i++) {//找到每一个非空桶和最近一个左边非空桶前面的当前最小减前一个最大
			if (hasNum[i]) {
				res = Math.max(res, mins[i] - lastMax);
				lastMax = maxs[i];
			}
		}
		return res;//答案
	}
	//应该去几号桶
	private static int bucket(long num, long len, long min, long max) {
		return (int) ((num - min) * len / (max - min));
	}

	// for test
	public static int comparator(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		Arrays.sort(nums);
		int gap = Integer.MIN_VALUE;
		for (int i = 1; i < nums.length; i++) {
			gap = Math.max(nums[i] - nums[i - 1], gap);
		}
		return gap;
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
	public static void main(String[] args) {
		int testTime = 500000;
		int maxSize = 100;
		int maxValue = 100;
		boolean succeed = true;
		for (int i = 0; i < testTime; i++) {
			int[] arr1 = generateRandomArray(maxSize, maxValue);
			int[] arr2 = copyArray(arr1);
			if (maxGap(arr1) != comparator(arr2)) {
				succeed = false;
				break;
			}
		}
		System.out.println(succeed ? "Nice!" : "Fucking fucked!");
	}

}
