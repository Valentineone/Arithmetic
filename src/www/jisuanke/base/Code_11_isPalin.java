package www.jisuanke.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangchong
 * @date 2019/4/25 17:37
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_11_isPalin {
    public static boolean isPalin(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String nStr = String.valueOf(n);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(nStr);
        int time = 0;
        while (true) {
            if (isPalin(nStr)) {
                break;
            }
            int curBefore = Integer.valueOf(nStr);
            String nc = new StringBuffer(nStr).reverse().toString();
            nStr = String.valueOf(nc);
            int curAfter = Integer.parseInt(nStr);
            int curSum = curBefore + curAfter;
            nStr = String.valueOf(curSum);
            arrayList.add(nStr);
            time++;
        }
        System.out.println(time);
        for (int i = 0; i < arrayList.size(); i++) {
            if (i < arrayList.size() - 1) {
                System.out.print(arrayList.get(i) + "--->");
            } else {
                System.out.print(arrayList.get(i));
            }
        }
    }
}
