package www.jisuanke.base;

import java.awt.print.Paper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/4/26 20:48
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_14_DouNiu {
    public static boolean isSiZha(int[] arr) {
        int sameOne = 0;
        int sameTwo = 0;
        int one = arr[0];
        int two = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != one) {
                two = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j] && one == arr[i]) {
                        sameOne++;
                        break;
                    } else if (arr[i] == arr[j] && two == arr[i]) {
                        sameTwo++;
                        break;
                    }
                }
            }
        }
        if (sameOne >= 4 || sameTwo >= 4) {
            return true;
        }
            return false;
        }
        public static boolean isWuXiaoNiu(int[] arr) {
        int sum = 0;
        for (int i : arr
             ) {
            sum += i;
        }

        if (sum <= 10) {
            for (int i : arr
                    ) {
                if (i == 5) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static boolean isNiuNiu(int[] arr) {
        int sum = 0;
        for (int i : arr
             ) {
            sum += i;
        }
        if (sum % 10 == 0) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j) {
                        if ((arr[i] + arr[j]) % 10 == 0) {
                            return true;
                        }
                    }

                }
            }
        }
        return false;
    }
    public static int niuX(int arr[]) {
        int two = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i != j && i != k && j != k) {
                        if ((arr[i] + arr[j] + arr[k]) % 10 == 0) {
                            for (int m = 0; m < arr.length; m++) {
                                if (m != i && m != j && m != k) {
                                    two += arr[m];
                                }
                            }
                            return two % 10;
                        }
                    }
                }
            }
        }
        return 10;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                arr[i] = 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        if (isSiZha(arr)) {
            System.out.println("quadra bomb orz");
        } else if (isWuXiaoNiu(arr)) {
            System.out.println("penta calf");
        } else if (isNiuNiu(arr)) {
            System.out.println("you can you up");
        } else if (niuX(arr) < 10) {
            System.out.println("too young too simple:calf " + niuX(arr));
        } else {
            System.out.println("gg");
        }


    }
}
