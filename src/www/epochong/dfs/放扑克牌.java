package www.epochong.dfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/29 18:23
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * Dfs(��ǰ��һ���Ĵ����߼�) {
 * 1. �жϱ߽磬�Ƿ��Ѿ�һ�����ߵ����ˣ����ϻ���
 * 2. ���Ե��µ�ÿһ�ֿ���
 * 3. ȷ��һ�ֿ���֮�󣬼�����һ�� Dfs(��һ��)
 *  }
 */
public class ���˿��� {
    public static void DFS(int index, int n, int[] box, int[] book) {
        if (index == n + 1) {
            System.out.println(box[1] + " " + box[2] + " " + box[3]);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (book[i] == 0) {
                box[index] = i;
                book[i] = 1;
                DFS(index + 1,n,box,book);
                book[i] = 0;
            }

        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] box = new int[n];
        for (int i = 0; i < box.length; i++) {
            box[i] = 0;
        }
        int[] book = new int[n];
        for (int i = 0; i < book.length; i++) {
            book[i] = 0;
        }

        System.out.print("1��n���˿��Ƶķ���,����n:>");
        DFS(1,n,box,book);
    }
}
