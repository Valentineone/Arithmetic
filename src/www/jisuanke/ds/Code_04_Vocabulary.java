package www.jisuanke.ds;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/3 10:14
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_04_Vocabulary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> vocabulary = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int first = input.nextInt();
            String vo = input.next().toLowerCase();

            if (first == 0) {
                if (vocabulary.contains(vo)) {
                continue;
                }
                vocabulary.add(vo);

            } else {
                if (vocabulary.contains(vo)) {
                    res.add("Yes");
                } else {
                    res.add("No");
                }
            }
        }
        for (String s : res
             ) {
            System.out.println(s);
        }
    }
}
