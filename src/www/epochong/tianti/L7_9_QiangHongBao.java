package www.epochong.tianti;

import java.util.ArrayList;
import java.util.Scanner;

public class L7_9_QiangHongBao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
//        int[] people = new int[line];
        int[] peopleMoney = new int[line];
        int[] numHongBao = new int[line];
        ArrayList[] arr = new ArrayList[line];
        for (int i = 0; i < line; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < line; i++) {
            int col = input.nextInt();
            arr[i] = new ArrayList(col);
            for (int j = 0; j < col; j++) {
                int person = input.nextInt();
                peopleMoney[person] += input.nextInt();
                numHongBao[person]++;
            }

        }
    }
}
