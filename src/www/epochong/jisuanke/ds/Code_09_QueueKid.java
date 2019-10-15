package www.epochong.jisuanke.ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/5/3 17:11
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_09_QueueKid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(i + 1);
        }
        int index = 0;
        int zeroNum = 0;
        for (int i = 0; i < n; i++) {
            while (arrayList.get(i) == 0) {
                i++;
                if (i == n) {
                    i = 0;
                }
            }
            index++;
            if (index % m == 0) {
                arrayList.set(i,0);
                zeroNum++;
                index = 0;
                if (zeroNum == n - 1) {
                    break;
                }
            }
            if (i == n - 1) {
                i = -1;
            }
        }
        for (int i : arrayList
             ) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
