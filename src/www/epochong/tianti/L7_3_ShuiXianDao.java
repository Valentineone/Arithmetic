package www.epochong.tianti;

import java.util.Scanner;

public class L7_3_ShuiXianDao {
    public static int isWin(int a, int b, int c, int d) {
        if (b == a + c && d == a + c) {
            return 1;
        } else if (b == a + c) {
            return 2;
        } else if (d == a + c) {
            return 3;
        } else {
            return 4;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
        int aH = 0;
        int bH = 0;
        int[][] arr = new int[n][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
            if (isWin(arr[i][0],arr[i][1],arr[i][2],arr[i][3]) == 1 || isWin(arr[i][0],arr[i][1],arr[i][2],arr[i][3]) == 4) {
                continue;
            } else if (isWin(arr[i][0],arr[i][1],arr[i][2],arr[i][3]) == 2) {
                aH++;
            } else if (isWin(arr[i][0],arr[i][1],arr[i][2],arr[i][3]) == 3) {
                bH++;
            }
            if (aH > a) {
                System.out.println("A");
                System.out.println(bH);
                break;
            }
            if (bH > b) {
                System.out.println("B");
                System.out.println(aH);
                break;
            }
        }
    }
}
