package www.epochong.jisuanke.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/5/17 19:19
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_12_NMinAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }
        for (int i = 0; i < n; i++) {
            b.add(input.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b);
        ArrayList<Integer> res = new ArrayList<>();
        int indexa = 0;
        int indexb = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res.add(a.get(indexa) + b.get(indexb));
                continue;
            }
            int first = a.get(indexa) + b.get(indexb + 1);
            int second = a.get(indexa + 1) + b.get(indexb);
            if (first < second) {
                res.add(first);
                indexb++;
            } else if (first > second){
                res.add(second);
                indexa++;
            } else {
                res.add(first);
            }
        }
    }
}
