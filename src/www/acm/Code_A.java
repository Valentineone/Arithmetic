package www.acm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/11 10:15
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_A {
    public static boolean isSu(int n) {
        if (n == 1 || n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
               if (n % i == 0) {
                   return false;
               }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0 ; i < n; i++) {
            arrayList.add(input.nextInt());
        }

        ArrayList<Integer> tem = new ArrayList<>();
        tem.addAll(arrayList);
        //System.out.println("tem" + tem);
        Collections.sort(arrayList);
        //System.out.println(tem);
       // System.out.println("arrlist:" + arrayList);
        ArrayList<Integer> su = new ArrayList<>();
        for (int i = arrayList.get(arrayList.size() - 1); i > 0; i--) {
            if (isSu(i)) {
                su.add(i);
            }
        }
        Collections.sort(su);
        //System.out.println("su" + su);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0 ; i < n; i++) {
            for (int j = su.size() - 1; j >= 0; j--) {
                if (tem.get(i) % su.get(j) == 0) {
                    res.add(j);
                    break;
                }
            }
        }
        for (int i : res
             ) {
            System.out.println(i);
        }
        //System.out.println(su);
    }
}
