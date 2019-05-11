package www.acm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/11 13:33
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_K {
    public static double distance(int x, int y, int z, int m, int n, int p) {
        return Math.sqrt(Math.pow(Math.pow(x,2) - Math.pow(m,2),2) + Math.pow(Math.pow(y,2) - Math.pow(n,2),2) + Math.pow(Math.pow(z,2) - Math.pow(p,2),2));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] di = new int[4];
            int[] fi1 = new int[3];
            int[] fi2 = new int[3];
            for (int j = 0; j < 4; j++) {
                di[j] = input.nextInt();
            }
            for (int j = 0; j < 3; j++) {
                fi1[j] = input.nextInt();
            }
            for (int j = 0; j < 3; j++) {
                fi2[j] = input.nextInt();
            }
            double qie1 = Math.sqrt(Math.pow(distance(fi1[0],fi1[1],fi1[2],di[0],di[1],di[2]),2) - Math.pow(di[3],2));
            double qie2 = Math.sqrt(Math.pow(distance(fi2[0],fi2[1],fi2[2],di[0],di[1],di[2]),2) - Math.pow(di[3],2));
            if (distance(fi1[0],fi1[1],fi1[2],fi2[0],fi2[1],fi2[2]) >= qie1 + qie2) {
                res.add("Happy Bu Neng");
            } else {
                res.add("Earth Happy");
            }

        }
        for (String str : res
             ) {
            System.out.println(str);
        }
    }
}
