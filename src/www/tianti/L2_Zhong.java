package www.tianti;

import java.util.Scanner;

public class L2_Zhong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] arr = str.toCharArray();
        int n = 0;
        int hh = Integer.parseInt(str.substring(0,2));
        int mm = Integer.parseInt(str.substring(4,5));

        if ( hh <= 12 && hh >= 0) {
            System.out.println("Only " + str+".  Too early to Dang.");
        } else {
            n = hh - 12;
            if (mm != 0) {
                n++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Dang");
        }
    }
}
