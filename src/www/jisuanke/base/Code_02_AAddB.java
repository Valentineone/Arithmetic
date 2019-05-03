package www.jisuanke.base;

import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/4/23 20:41
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02_AAddB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = input.nextInt();
            arr[i][1] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + arr[i][1]);
        }
    }
}
