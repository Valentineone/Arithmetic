package www.jisuanke.ds;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/3 18:32
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_10_Say7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int n = input.nextInt();
        int m = input.nextInt();
        int t = input.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(input.next());
        }
        int index = t - 1;
        int num7 = 0;
        int i = m - 1;
        for (; i < n; i++) {
            while (arrayList.get(i).equals("wangchong")) {
                i++;
                if (i == n) {
                    i = 0;
                }
            }
            index++;
            if (index % 7 == 0 || String.valueOf(index).contains("7")) {
                arrayList.set(i,"wangchong");
                num7++;
                if (num7 == n - 1) {
                    break;
                }
            }
            if (i == n - 1) {
                i = -1;
            }
        }
        for (String str : arrayList
                ) {
            if (!str.equals("wangchong")) {
                System.out.println(str);
            }
        }

    }
}
