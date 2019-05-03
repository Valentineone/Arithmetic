package www.jisuanke.base;
;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/4/30 14:21
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_05_sqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int k = 0; k <= Math.sqrt(n); k++) {
            for (int m = 0; m <= Math.sqrt(n); m++) {
                for (int i = (int) Math.sqrt(n); i >= 0; i--) {
                    for (int j = (int) Math.sqrt(n - i * i); i >= 0; i--) {
                        if (i * i + j * j + k * k + m * m == n) {
                            System.out.println(i + " " + j + " " + k + " " + m);
                            i = 0;
                            j = 0;
                            k = n;
                            m = n;
                        }
                    }
                }
            }
        }
       /* int tem = 0;
        for (int i = 0; i <= Math.sqrt(n); i++) {
            for (int j = 0; j <= Math.sqrt(n); j++) {
                for (int k = tem; k >= 0; k--) {
                    for (int m = (int) Math.sqrt(n); m > 0; m--) {
                        tem = (int) Math.sqrt(n - m * m);
                        if (i * i + j * j + k * k + m * m == n) {
                            System.out.println(i + " " + j + " " + k + " " + m);
                            i = n;
                            j = n;
                            k = 0;
                            m = 0;
                        }
                    }
                    tem = 0;
                }

            }
        }*/
    }
}
