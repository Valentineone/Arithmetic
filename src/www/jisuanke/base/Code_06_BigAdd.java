package www.jisuanke.base;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/4/23 22:46
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_06_BigAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        BigDecimal bigDecimal = new BigDecimal(str);
        String str1 = input.nextLine();
        BigDecimal bigDecimal1 = new BigDecimal(str1);
        System.out.println(bigDecimal.add(bigDecimal));
        
    }
}
