package basic_class_02;

/**
 * advance 2, 13:20
 * 在一个无序数组中知道第k小,或者第k大的数
 * 先排序再取 O(longN)
 *
 * 经典算法
 * 三路快排思想的方式只找一边
 * 最坏:T(N) = T(N - 1) + T(N) O(N^2)
 * 最好:T(N) = T(N/2) + T(N)   O(N) 随机元素
 *
 *
 * BFPRT O(N) 不计算概率,不用算长期期望,严格O(N) 非常的精彩
 * 类似荷兰国旗问题
 * 等于部分两边下标,看要求的在哪个位置范围,左右两边只走一边
 * 已经足够优秀了
 * 不同之处
 * 选择划分值的策略不一样,剩余部分和三路快排一样
 *
 * 1,5个5个分组 最后剩余可能不满 5个一组排序O(1)
 * 2,一共N/5组,BFPRT一共5个人所以分5组,有些数符合有些不符合(3,7)O(N)
 * 3,把每个组的中位数拿出来组成一个新的数组, 偶数拿上中位数 新数组长度为N/5 newarrO(N)
 * 4,bfprt(newarr,newarr.length/2) 中位数中的中位数 递归的完成指导直接算出中位数就是基准值O(N)
 * 5,根据基准值三路快排划分O(N)
 * 6,命中直接返回,没命中走左边还是走右边
 * 按照最差情况估计
 * 左边最差:最多有多少个数比p小
 * 右边最差:最少有多少个数比p大 等价左侧最差
 *
 * 中位数的中位数可以确保这个中位数在这个中位数数组中有一半的中位数(N / 5  *  1 / 2)
 * 这一半都对应着原来的5个数数组中的中位数,所以加上之前的两个,连着自己*3 共 3N/10 个比基准值大
 * 所以有7N/10比基准值小
 * 此时找到左侧右侧最大规模
 * T(N) = T(N/5) + T(7N/10) + T(N) + O(N) ---- O(N) 选择规模的时候如果可以收敛到O(N)则可以,如果不可以则舍弃
 * 算法导论第九章整个一章都在证这个
 *
 * 大部分用堆做O(N*logK)
 * 最优解BFPRT
 *
 * 国外面试只靠算法数据结构 和 系统设计
 *
 */
public class Code_06_BFPRT {

	// O(N*logK) 用堆做的不是BFPRT算法
	public static int[] getMinKNumsByHeap(int[] arr, int k) {
		if (k < 1 || k > arr.length) {
			return arr;
		}
		int[] kHeap = new int[k];
		for (int i = 0; i != k; i++) {
			heapInsert(kHeap, arr[i], i);
		}
		for (int i = k; i != arr.length; i++) {
			if (arr[i] < kHeap[0]) {
				kHeap[0] = arr[i];
				heapify(kHeap, 0, k);
			}
		}
		return kHeap;
	}

	public static void heapInsert(int[] arr, int value, int index) {
		arr[index] = value;
		while (index != 0) {
			int parent = (index - 1) / 2;
			if (arr[parent] < arr[index]) {
				swap(arr, parent, index);
				index = parent;
			} else {
				break;
			}
		}
	}

	public static void heapify(int[] arr, int index, int heapSize) {
		int left = index * 2 + 1;
		int right = index * 2 + 2;
		int largest = index;
		while (left < heapSize) {
			if (arr[left] > arr[index]) {
				largest = left;
			}
			if (right < heapSize && arr[right] > arr[largest]) {
				largest = right;
			}
			if (largest != index) {
				swap(arr, largest, index);
			} else {
				break;
			}
			index = largest;
			left = index * 2 + 1;
			right = index * 2 + 2;
		}
	}

	// O(N)
	public static int[] getMinKNumsByBFPRT(int[] arr, int k) {
		if (k < 1 || k > arr.length) {
			return arr;
		}
		int minKth = getMinKthByBFPRT(arr, k);
		int[] res = new int[k];
		int index = 0;
		for (int i = 0; i != arr.length; i++) {
			if (arr[i] < minKth) {
				res[index++] = arr[i];
			}
		}
		for (; index != res.length; index++) {
			res[index] = minKth;
		}
		return res;
	}
    //得到最小的第K个数
	public static int getMinKthByBFPRT(int[] arr, int K) {
		int[] copyArr = copyArray(arr);
		return bfprt(copyArr, 0, copyArr.length - 1, K - 1);
	}

	public static int[] copyArray(int[] arr) {
		int[] res = new int[arr.length];
		for (int i = 0; i != res.length; i++) {
			res[i] = arr[i];
		}
		return res;
	}

	public static int bfprt(int[] arr, int begin, int end, int i) {
		if (begin == end) {
			return arr[begin];
		}
		int pivot = medianOfMedians(arr, begin, end);//中位数数组的中位数
		int[] pivotRange = partition(arr, begin, end, pivot);
		if (i >= pivotRange[0] && i <= pivotRange[1]) {
			return arr[i];//命中
		} else if (i < pivotRange[0]) {
			return bfprt(arr, begin, pivotRange[0] - 1, i);
		} else {
			return bfprt(arr, pivotRange[1] + 1, end, i);
		}
	}

	public static int medianOfMedians(int[] arr, int begin, int end) {
		int num = end - begin + 1;
		int offset = num % 5 == 0 ? 0 : 1;//5个数一组,最后一个如果不满5个数多出来一个
		int[] mArr = new int[num / 5 + offset];
		for (int i = 0; i < mArr.length; i++) {
			int beginI = begin + i * 5;
			int endI = beginI + 4;
			mArr[i] = getMedian(arr, beginI, Math.min(end, endI));
		}
		return bfprt(mArr, 0, mArr.length - 1, mArr.length / 2);
	}

	public static int[] partition(int[] arr, int begin, int end, int pivotValue) {
		int small = begin - 1;
		int cur = begin;
		int big = end + 1;
		while (cur != big) {
			if (arr[cur] < pivotValue) {
				swap(arr, ++small, cur++);
			} else if (arr[cur] > pivotValue) {
				swap(arr, cur, --big);
			} else {
				cur++;
			}
		}
		int[] range = new int[2];
		range[0] = small + 1;
		range[1] = big - 1;
		return range;
	}

	public static int getMedian(int[] arr, int begin, int end) {
		insertionSort(arr, begin, end);
		int sum = end + begin;
		int mid = (sum / 2) + (sum % 2);
		return arr[mid];
	}

	public static void insertionSort(int[] arr, int begin, int end) {
		for (int i = begin + 1; i != end + 1; i++) {
			for (int j = i; j != begin; j--) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				} else {
					break;
				}
			}
		}
	}

	public static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i != arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 6, 9, 1, 3, 1, 2, 2, 5, 6, 1, 3, 5, 9, 7, 2, 5, 6, 1, 9 };
		// sorted : { 1, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5, 5, 6, 6, 6, 7, 9, 9, 9 }
		printArray(getMinKNumsByHeap(arr, 10));
		printArray(getMinKNumsByBFPRT(arr, 10));

	}

}
