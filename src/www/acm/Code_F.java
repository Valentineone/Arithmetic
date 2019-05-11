package www.acm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/11 10:37
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0;; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            for (int j = 0; j < n; j++) {
                a.add(input.nextInt());
            }
            for (int k = 0; k < n; k++) {
                b.add(input.nextInt());
            }
            Collections.sort(a);
            Collections.sort(b);
            int index = 0;
            for (int j = n - 1; j >= 0; j--) {
               if (b.get(j) < a.get(a.size() - 1)) {
                   index = j;
                   break;
               }
            }
            ArrayList<Integer> newB = new ArrayList<>();
            for (int j = index + 1; j < n; j++) {
                newB.add(b.get(j));
            }
            for (int j = 0; j <= index; j++) {
                newB.add(b.get(j));
            }

           /* ArrayList<Integer> newA = new ArrayList<>();
            for (int j = n - 1; j >= 0; j--) {
                newA.add(a.get(j));
            }*/
            System.out.println("a" + a);
            System.out.println("nB" + newB);
            int money = 0;
            for (int j = 0; j < n; j++) {
                if (a.get(j) > newB.get(j)) {
                    money += 200;
                } else if (a.get(j) < newB.get(j)){
                    money -= 200;
                }
            }
            res.add(money);
        }
        for (int i : res
             ) {
            System.out.println(i);
        }
      /*  System.out.println(res);*/
    }
}
