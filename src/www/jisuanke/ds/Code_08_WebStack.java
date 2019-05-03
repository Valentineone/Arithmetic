package www.jisuanke.ds;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangchong
 * @date 2019/5/3 16:23
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_08_WebStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Stack<String> stack = new Stack<>();
        Stack<String> back = new Stack<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = input.next();
            if (str.equals("VISIT")) {
                String url = input.next();
                stack.push(url);
                arrayList.add(url);
                back.removeAllElements();
            } else if (str.equals("BACK")) {
                if (stack.size() <= 1) {
                    arrayList.add("Ignore");
                } else {
                    back.push(stack.pop());
                    arrayList.add(stack.peek());
                }
            } else if (str.equals("FORWARD")) {
                if (back.isEmpty()) {
                    arrayList.add("Ignore");
                } else {
                    String backUrl = back.pop();
                    stack.push(backUrl);
                    arrayList.add(backUrl);
                }
            }
        }
        for (String s : arrayList
             ) {
            System.out.println(s);
        }
    }
}
