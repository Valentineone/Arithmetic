package www.tianti;

import java.util.ArrayList;
import java.util.Scanner;

public class L7_4_Shuai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(input.nextInt());
            arr.add(input.nextLine());
        }
        int cha = input.nextInt();
        int[] chaXU = new int[cha];
        for (int i = 0; i < cha; i++) {
            chaXU[i] = input.nextInt();
        }
        for (int i = 0; i < cha; i++) {
            int notIn = 0;
            for (int j = 0; j < n; j++) {
                if (arr.get(j).contains(String.valueOf(chaXU[i])) && !(num.get(j) == 1)) {
                    continue;
                } else if (arr.get(j).contains(String.valueOf(chaXU[i])) && num.get(j) == 1) {
                    if (!res.contains(chaXU[i])) {
                        res.add(chaXU[i]);
                    }
                } else {
                    notIn++;
                }
            }
            if (notIn == n) {
                if (!res.contains(chaXU[i])) {
                    res.add(chaXU[i]);
                }
            }
        }
        for (int i = 0; i < res.size(); i++) {
            if (i == res.size() - 1) {
                System.out.print(res.get(i));
            } else {
                System.out.print(res.get(i) + " ");
            }
        }
        if (res.size() == 0) {
            System.out.println("No one is handsome");
        }
    }
}
