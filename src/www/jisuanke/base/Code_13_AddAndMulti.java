package www.jisuanke.base;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/4/25 23:25
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_13_AddAndMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spByMulti = new String[1];
        spByMulti[0] = str;
        if (spByMulti[0].contains("+")) {
            spByMulti = str.split("\\+");
        }

        for (int i = 0; i < spByMulti.length; i++) {
            if (spByMulti[i].contains("*")) {
                String[] multi = spByMulti[i].split("\\*");
                BigDecimal bigDecimal = new BigDecimal(multi[0]);
                BigDecimal bigDecimal1 = new BigDecimal(multi[1]);
                spByMulti[i] = String.valueOf(bigDecimal.multiply(bigDecimal1));
            }
        }
        BigDecimal bigDecimal = new BigDecimal(0);
        for (int i = 0; i < spByMulti.length; i++) {
            BigDecimal bigDecimal1 = new BigDecimal(spByMulti[i]);
            bigDecimal = bigDecimal.add(bigDecimal1);
        }
        String strSum = String.valueOf(bigDecimal);
        if (strSum.length() <= 4) {
            System.out.println(strSum);
        } else {
            System.out.println(strSum.substring(strSum.length() - 4));
        }
    }
}
