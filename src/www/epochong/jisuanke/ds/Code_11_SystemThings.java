package www.epochong.jisuanke.ds;

import java.util.*;

/**
 * @author epochong
 * @date 2019/5/3 18:57
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_11_SystemThings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> queue = new ArrayList<>();
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
                String str = input.next();
                int number = input.nextInt();
                int time = input.nextInt();
                arraylist.add(time);
                map.put(time,number);
        }
        Collections.sort(arraylist);
        for (int i = 1; ; i++) {
            for (int j = 0; j < arraylist.size(); j++) {
                if (i % arraylist.get(j) == 0) {
                   // System.out.println(i + " " + arraylist.get(j));
                    queue.add(map.get(arraylist.get(j)));
                   // System.out.println(queue);
                }
            }
            if (queue.size() == k) {
                break;
            }
        }
        for (int i : queue
             ) {
            System.out.println(i);
        }
    }
}
