package www.jisuanke.ds;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author wangchong
 * @date 2019/5/3 13:38
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_06_FruitTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<String,Map<String,Integer>> cityFruit = new TreeMap<>();
        Map<String,Integer> fruitNum = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String fruit = input.next();
            String city = input.next();
            int num = input.nextInt();
            if (cityFruit.containsKey(city)) {
                fruitNum.putAll(cityFruit.get(city));
            } else {
                fruitNum = new TreeMap<>();
            }
            if (fruitNum.containsKey(fruit)) {
                fruitNum.put(fruit,fruitNum.get(fruit) + num);
            } else {
                fruitNum.put(fruit,num);
            }
            cityFruit.put(city,fruitNum);

        }
        for (Map.Entry<String,Map<String,Integer>> entry : cityFruit.entrySet()
             ) {
            System.out.println(entry.getKey());
            for (Map.Entry<String,Integer> fruitMap : cityFruit.get(entry.getKey()).entrySet()
                 ) {
                System.out.println("   |----" + fruitMap.getKey() + "(" + fruitMap.getValue() + ")");
            }
        }
    }
}
