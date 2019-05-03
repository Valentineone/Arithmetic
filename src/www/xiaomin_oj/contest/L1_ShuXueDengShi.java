package www.xiaomin_oj.contest;

import java.util.Scanner;

public class L1_ShuXueDengShi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int count = 0;
        for (int x1 = -50; x1 <= 50; x1++) {
            for (int x2 = -50; x2 <= 50; x2++) {
                for (int x3 = -50; x3 <= 50; x3++) {
                    for (int x4 = -50; x4 <= 50; x4++) {
                        for (int x5 = -50; x5 <= 50; x5++) {
                            if (a * Math.pow(x1,3) + b * Math.pow(x2,3) + c * Math.pow(x3,3) == d * Math.pow(x4,3) + e * Math.pow(x5,3)) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
