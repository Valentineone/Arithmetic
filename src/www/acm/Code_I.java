package www.acm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/11 12:22
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_I {
    public static int countIslands(char[][] m) {
        if (m == null || m[0] == null) {
            return 0;
        }
        int N = m.length;
        int M = m[0].length;
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (m[i][j] == '#') {
                    res++;
                    infect(m, i, j, N, M);
                }
            }
        }
        return res;
    }

    public static void infect(char[][] m, int i, int j, int N, int M) {
        if (i < 0 || i >= N || j < 0 || j >= M || m[i][j] != '#') {//仅1,不是1就不执行
            return;
        }
        m[i][j] = 2;
        infect(m, i + 1, j, N, M);//感染上
        infect(m, i - 1, j, N, M);//感染下
        infect(m, i, j + 1, N, M);//感染右
        infect(m, i, j - 1, N, M);//感染左
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  n = input.nextInt();
        String str = input.nextLine();
        String[] arr = new String[n];
        char[][] chars = new char[n][n];
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i  = 0 ; i < n; i++) {
            arr[i] = input.next();
            chars[i] = arr[i].toCharArray();
        }
        System.out.println(chars);
        System.out.println(arr);
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 1;j ++) {
                if (arrayList.get(i).charAt(j) == '#') {
                    if (arrayList.get(i).charAt(j - 1) == '#' && arrayList.get(i).charAt(j + 1) == '#'
                            && arrayList.get(i - 1).charAt(j) == '#' && arrayList.get(i + 1).charAt(j) == '#') {
                        num++;
                    }
                }
            }

        }
        System.out.println(num);
    }
}
