package www.epochong.tianti;

import java.util.Scanner;

public class L6_TiZhong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ti = input.nextInt();
        System.out.printf("%.1f",(ti - 100) * 0.9 * 2);
    }
}
