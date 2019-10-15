package www.epochong.jisuanke.base;

import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/4/23 21:08
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_03_ReverseMartrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int[][] reArr = new int[m][n];
        for (int i = 0 ;i < m; i++) {
            for (int j = 0; j < n; j++) {
                reArr[i][j] =  arr[n - j - 1][i];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1) {
                    System.out.print(reArr[i][j] + " ");
                } else {
                    System.out.print(reArr[i][j]);
                }

            }
            if (i < m - 1) {
                System.out.println();
            }
        }
    }
}
