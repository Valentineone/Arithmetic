package www.acm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/11 9:05
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int A = input.nextInt();
            int B = input.nextInt();
            String an = input.next();
            String as = input.nextLine();
            String bn = input.next();
            String bs = input.nextLine();
            if (A > B) {
                arrayList.add("NO");
            } else {
                arrayList.add("YES");
            }
        }
        for (String str : arrayList
             ) {
            System.out.println(str);
        }
    }
}
