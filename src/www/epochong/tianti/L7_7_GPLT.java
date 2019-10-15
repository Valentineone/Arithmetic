package www.epochong.tianti;

import java.util.Scanner;

public class L7_7_GPLT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] arr = str.toCharArray();
        int[] num = new int[4];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'g' || arr[i] == 'G') {
                num[0]++;
            } else if (arr[i] == 'p' || arr[i] == 'P') {
                num[1]++;
            } else if (arr[i] == 'l' || arr[i] == 'L') {
                num[2]++;
            } else if (arr[i] == 't' || arr[i] == 'T') {
                num[3]++;
            }
        }
        boolean judge = false;
        do {
            if (num[0]-- > 0) {
                System.out.print("G");
            }
            if (num[1]-- > 0){
                System.out.print("P");
            }
            if (num[2]-- > 0) {
                System.out.print("L");
            }
            if (num[3]-- > 0) {
                System.out.print("T");
            }
            if (num[0] > 0 || num[1] > 0 || num[2] > 0 || num[3] > 0) {
                judge = true;
            } else {
                judge =false;
            }
        } while (judge);
    }
}
