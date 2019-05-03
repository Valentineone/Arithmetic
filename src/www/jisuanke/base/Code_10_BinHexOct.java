package www.jisuanke.base;

import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/4/25 17:28
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_10_BinHexOct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deci = input.nextInt();
        int jinzhi = input.nextInt();
        String str = Integer.toString(deci,jinzhi);

        System.out.println(str.toUpperCase());
    }
}
