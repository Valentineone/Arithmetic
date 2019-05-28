package www.wangchong.study;


import java.util.Stack;

/**
 * @author wangchong
 * @date 2019/4/20 18:00
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Test {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (stack.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 257; i++) {
            int pow = (int)Math.pow(i,2);
            String str = String.valueOf(pow);
            if (isPalindrome(str) && pow > 9) {
                System.out.println(i);
            }
        }
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.6));;
    }
}
