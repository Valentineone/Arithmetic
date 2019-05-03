package www.wangchong.study;

import java.util.HashMap;
import java.util.Scanner;
public class HashMap2 {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();
        Scanner inLine = new Scanner(System.in);
        String line = inLine.nextLine();
        Scanner input = new Scanner(line);
        while (input.hasNextInt()) {
            int cur = input.nextInt();
            if (map.containsKey(cur)) {
                map.put(cur,2);
            } else {
                map.put(cur, 1);
            }
        }
        //map.keySet()获得已经存入HashMap的所有key值
        for (int mapKey : map.keySet()
             ) {
            if (map.get(mapKey).equals(1)) {
                System.out.println(mapKey);
            }
        }
    }
}
