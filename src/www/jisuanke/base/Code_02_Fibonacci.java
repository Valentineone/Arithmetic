package www.jisuanke.base;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/4/23 20:47
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02_Fibonacci {
    public static BigDecimal fibonacci(int n) {
        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal bigDecimal1 = new BigDecimal(1);
        BigDecimal bigDecimal2 = new BigDecimal(1);
        for (int i = 2; i < n; i++) {
            bigDecimal = bigDecimal1.add(bigDecimal2);
            bigDecimal1 = bigDecimal2;
            bigDecimal2 = bigDecimal;
        }
        return bigDecimal.divideAndRemainder(BigDecimal.valueOf(1000000007))[1];

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fibonacci(n));
    }
}
