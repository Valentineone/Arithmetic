package www.tianti;

import java.util.Scanner;

public class L7_8_HouTian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 1 && n <= 5) {
            System.out.println(n + 2);
        } else {
            System.out.println(n - 5);
        }
    }
}
