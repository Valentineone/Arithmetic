package www.wangchong.study;

import java.util.ArrayList;

/**
 * @author wangchong
 * @date 2019/5/1 20:06
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class ArryayListAddAll {
    public static void main(String[] args) {
        ArrayList[] arrayLists = new ArrayList[3];
        for (int i = 0; i < 3; i++) {
            arrayLists[i] = new ArrayList<Integer>();
        }
        arrayLists[0].add(2);
        arrayLists[0].add(3);
        arrayLists[0].add(1);
        arrayLists[1].add(5);
        arrayLists[1].add(6);
        arrayLists[1].add(4);
        arrayLists[0].addAll(arrayLists[1]);
        System.out.println(arrayLists[0]);
    }
}
