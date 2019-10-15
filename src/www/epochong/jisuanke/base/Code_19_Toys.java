package www.epochong.jisuanke.base;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/4/29 22:23
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_19_Toys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < n; i++) {
            int first = input.nextInt();
            for (int j = 0; j < first; j++) {
                int element = input.nextInt();
                if (!arr.contains(element)) {
                    arr.add(element);
                }
            }
        }
        if (m >= arr.size()) {
            System.out.println(arr.size());
        } else {
            System.out.println(m);
        }
    }
}
