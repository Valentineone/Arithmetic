package www.jisuanke.ds;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangchong
 * @date 2019/5/3 15:53
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_07_KouHao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Stack<Character> stackLeft = new Stack<>();
        Stack<Integer> stackIndex = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                if (!stackLeft.isEmpty()) {
                    stackLeft.pop();
                    map.put(stackIndex.pop(),i + 1);
                } else {
                    break;
                }
            } else {
                stackLeft.push(str.charAt(i));
                stackIndex.push(i + 1);
            }
        }
        if (stackLeft.isEmpty() && i == str.length() ) {
            System.out.println("Yes");
            for (HashMap.Entry entry : map.entrySet()
                 ) {
                System.out.println(entry.getKey() + " " +  entry.getValue());
            }
        } else {
            System.out.println("No");
        }
    }
}
