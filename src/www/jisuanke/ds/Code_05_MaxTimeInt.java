package www.jisuanke.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/3 11:13
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_05_MaxTimeInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int el = input.nextInt();
            if (!map.containsKey(el)) {
                map.put(el,1);
            } else {
                map.put(el,map.get(el) + 1);
            }
        }
        int maxValue = Integer.MIN_VALUE;
        for (HashMap.Entry<Integer,Integer> entry : map.entrySet()
             ) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
        }
        int maxKey = Integer.MIN_VALUE;
        for (HashMap.Entry<Integer,Integer> entry : map.entrySet()
             ) {
            if (entry.getValue() == maxValue) {
                if (entry.getKey() > maxKey) {
                    maxKey = entry.getKey();
                }
            }
        }
        System.out.println(maxKey + " " + map.get(maxKey));
    }
}
