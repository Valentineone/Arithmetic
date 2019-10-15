package www.epochong.tianti;

import java.util.Scanner;

public class L7_6_JiOu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int ji = 0;
        int ou = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                ji++;
            } else {
                ou++;
            }
        }
        System.out.println(ji + " " + ou);
    }
}
