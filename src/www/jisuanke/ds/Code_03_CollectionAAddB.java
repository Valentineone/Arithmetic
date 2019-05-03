package www.jisuanke.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/3 9:49
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_03_CollectionAAddB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        HashSet<Integer> res = new HashSet();
        for (int i = 0; i < n; i++) {
            A.add(input.nextInt());
        }
        for (int i = 0; i < m; i++) {
            B.add(input.nextInt());
        }
        res.addAll(A);
        res.addAll(B);
        ArrayList<Integer> resArrayList = new ArrayList<>();
        resArrayList.addAll(res);
        Collections.sort(resArrayList);
        for (int i = 0; i < resArrayList.size(); i++) {
            if (i < resArrayList.size() - 1) {
                System.out.print(resArrayList.get(i) + " ");
            } else {
                System.out.print(resArrayList.get(i));
            }
        }
    }
}
