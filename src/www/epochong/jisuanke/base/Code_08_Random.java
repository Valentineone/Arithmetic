package www.epochong.jisuanke.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/4/25 11:14
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_08_Random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int temp = input.nextInt();
            if (!arr.contains(temp)) {
                arr.add(temp);
            }
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
