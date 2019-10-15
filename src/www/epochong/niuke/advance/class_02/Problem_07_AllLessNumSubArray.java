package www.epochong.niuke.advance.class_02;

import java.util.LinkedList;

/**
 * @author epochong
 * @date 2019/5/18 20:57
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe 最大会减去最小值小于或等于num的子数组数量
 *            2-130:00
 */
public class Problem_07_AllLessNumSubArray {
    public static int getNum(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        LinkedList<Integer> qmin = new LinkedList<>();
        LinkedList<Integer> qmax = new LinkedList<>();
        int start = 0;
        int end = 0;
        int res = 0;
        while (start < arr.length) {
            while (end < arr.length) {
                while (!qmin.isEmpty() && arr[qmin.peekLast()] >= arr[end]) {
                    qmin.pollLast();
                }
                qmin.addLast(end);
                while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[end]) {
                    qmax.pollLast();
                }
                qmax.addLast(end);
                if (arr[qmax.getFirst()] - arr[qmin.getFirst()] > num) {
                    break;
                }
                end++;
            }
            //判断下标是否过期
            if (qmin.peekFirst() == start) {
                qmin.peekFirst();
            }
            if (qmax.peekFirst() == start) {
                qmax.pollFirst();
            }
            res += end - start;
            start++;
        }
        return res;
    }
}
