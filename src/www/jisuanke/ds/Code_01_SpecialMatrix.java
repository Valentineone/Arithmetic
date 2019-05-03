package www.jisuanke.ds;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/4/30 16:09
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01_SpecialMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList[] arrayList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            arrayList[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            arrayList[x - 1].add(y);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arrayList[i].size(); j++) {
                if (j < arrayList[i].size() - 1) {
                    System.out.print(arrayList[i].get(j) + " ");
                } else {
                    System.out.print(arrayList[i].get(j));
                }
            }
            System.out.println();
        }
    }
}
