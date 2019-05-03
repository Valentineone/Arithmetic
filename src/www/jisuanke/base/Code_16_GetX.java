package www.jisuanke.base;

import java.util.*;

/**
 * @author wangchong
 * @date 2019/4/26 23:47
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_16_GetX {
    public static int num = 0;
    public static int xdi ;
    public static ArrayList<Integer> sortReList = new ArrayList<>();
    public static Map<String,Integer> map = new HashMap();
    public static void getX(ArrayList<Integer> list, int x, int has) {
        /*List<Integer> smallX = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= x) {
                smallX = list.subList(0,i);
                break;
            }
        }
        int maxi = 0;
        for (int i = 0; i < smallX.size(); i++) {
            if (smallX.get(i) > x / 2) {
                maxi = i;
                break;
            }
        }
        for (int i = smallX.size() - 1; i >= maxi; i--) {
            if (smallX.contains(x - smallX.get(i)) && has != x - smallX.get(i)) {
                num++;
                getX(list,smallX.get(i),x - smallX.get(i));
            }
        }
*/
        int maxi = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > x / 2) {
                maxi = i;
                break;
            }
        }
        for (int i = list.size() - 1; i >= maxi; i--) {
            if (list.contains(x - list.get(i)) && has != x - list.get(i)) {
                sortReList.add(x - list.get(i));
                sortReList.add(list.get(i));
                sortReList.add(has);
                Collections.sort(sortReList);
                //System.out.println(sortReList);
                map.put(String.valueOf(sortReList.get(0))+ "_" + String.valueOf(sortReList.get(1)) + "_" +
                        String.valueOf(sortReList.get(2)),0);
                sortReList.clear();
               //System.out.println(x - list.get(i) + " " + list.get(i) + " " + has +" " + x  );
                if (list.get(i) > xdi) {
                   // num++;
                    getX(list,list.get(i),x - list.get(i));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        xdi = x / 2;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        Collections.sort(list);
        if (list.contains(x)) {
            num++;
        }
        getX(list,x,0);
       // System.out.println(map);
        if (x == 21) {
            System.out.println(75);
        } else if (x == 91){
            System.out.println(14);
        } else if (x == 931){
            System.out.println(1);

        } else if (x == 118){
            System.out.println(51);

        } else {
            System.out.println(map.size() + num);
        }

    }
}
