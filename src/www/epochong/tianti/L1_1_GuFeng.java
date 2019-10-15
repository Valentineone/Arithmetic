package www.epochong.tianti;

import java.util.Scanner;

public class L1_1_GuFeng {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[][] arr = new char[n][30];
        String str = input.nextLine();
        str = input.nextLine();
        char[] strArr = str.toCharArray();
        int k = 0;
        for (int i = 0; i <= str.length() / n; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][i] = strArr[k++];
                if (k == str.length()) {
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = str.length() / n; j >= 0; j--) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
