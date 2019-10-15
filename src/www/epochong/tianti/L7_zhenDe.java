package www.epochong.tianti;

import java.util.Scanner;

public class L7_zhenDe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i  < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            double biaozhun = (arr[i][0] - 100) * 0.9 * 2;
            int zhenshi = arr[i][1];
            if ((zhenshi- biaozhun < 0 ? (biaozhun - zhenshi) : (zhenshi - biaozhun)) < biaozhun* 0.1) {
                System.out.println("You are wan mei!");
            } else if (zhenshi- biaozhun < 0 &&(zhenshi- biaozhun < 0 ? (biaozhun - zhenshi) : (zhenshi - biaozhun)) >= biaozhun* 0.1){
                System.out.println("You are tai shou le!");
            } else if (zhenshi- biaozhun > 0 &&(zhenshi- biaozhun < 0 ? (biaozhun - zhenshi) : (zhenshi - biaozhun)) >= biaozhun* 0.1){
                System.out.println("You are tai pang le!");
            }
        }
    }


}
