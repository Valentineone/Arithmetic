package www.epochong.dfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/29 18:23
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 * Dfs(当前这一步的处理逻辑) {
 * 1. 判断边界，是否已经一条道走到黑了：向上回退
 * 2. 尝试当下的每一种可能
 * 3. 确定一种可能之后，继续下一步 Dfs(下一步)
 *  }
 */
public class 放扑克牌 {
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

        System.out.print("1到n的扑克牌的放置,输入n:>");
        DFS(1,n,box,book);
    }
}
