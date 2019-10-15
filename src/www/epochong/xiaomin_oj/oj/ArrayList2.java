package www.epochong.xiaomin_oj.oj;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner inLine = new Scanner(System.in);
        String line = inLine.nextLine();
        Scanner input = new Scanner(line);
        while (input.hasNextInt()) {
            arr.add(input.nextInt());
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                System.out.println(arr.get(i));
            }
        }

    }
}
