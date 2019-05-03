package www.tianti;

import java.util.Scanner;

public class L7_1_FanEr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] arr = str.toCharArray();
        double num = 0;
        int wei = 0;
        double beiShu = 1.0;
        double chengDu = 0.0;
        if (arr[0] == '-') {
            wei = arr.length - 1;
            beiShu *= 1.5;
        } else {
            wei = arr.length;
            beiShu = 1.0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '2') {
                num += 1.0;
            }
        }
        if (Integer.valueOf(arr[arr.length - 1]) % 2 == 0) {
            beiShu *= 2;
            chengDu = num / wei * beiShu;
        } else {
            chengDu = num / wei * beiShu;
        }
        String s = String.format("%.2f",chengDu * 100);
      //  double result = new BigDecimal(chengDu * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(s);
    }
}
