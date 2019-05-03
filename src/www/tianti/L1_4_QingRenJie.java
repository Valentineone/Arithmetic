package www.tianti;

import java.util.ArrayList;
import java.util.Scanner;

public class L1_4_QingRenJie {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        boolean judge = true;
        Scanner input = new Scanner(System.in);
        do {
            arr.add(input.next());
        }while (!arr.get(arr.size() - 1).equals("."));
        if (arr.size() <= 2) {
            System.out.println("Momo... No one is for you ...");
        } else if(arr.size() <= 13) {
            System.out.println(arr.get(1) + " is the only one for you...");
        } else {
            System.out.println(arr.get(1) + " and "+arr.get(13) + " are inviting you to dinner...");
        }
    }
}
