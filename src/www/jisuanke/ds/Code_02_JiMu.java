package www.jisuanke.ds;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/1 20:02
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02_JiMu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList[] arr = new ArrayList[m];
        for (int i = 0; i < m; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            arr[i].add(input.nextInt());
            arr[i].add(input.nextInt());
        }
        ArrayList[] arrayLists = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            arrayLists[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n; i++) {
            arrayLists[i].add(i + 1);
        }
        for (int i = 0; i < m; i++) {
            if ((arr[i].get(0)) == arr[i].get(1)) {
                continue;
            }
            arrayLists[(int) (arr[i].get(0)) - 1].addAll(arrayLists[(int) (arr[i].get(1)) - 1]);
            arrayLists[(int) (arr[i].get(1)) - 1].clear();
        }
        for (int i = 0; i < n; i++) {
            if (arrayLists[i].size() == 0) {
                System.out.println();
            } else {
                for (int j = 0; j < arrayLists[i].size(); j++) {
                    if (j < arrayLists[i].size() - 1) {
                        System.out.print(arrayLists[i].get(j) + " ");
                    } else {
                        System.out.print(arrayLists[i].get(j));
                    }
                }
                if (i < n - 1) {
                    System.out.println();
                }
            }
        }
    }
}
