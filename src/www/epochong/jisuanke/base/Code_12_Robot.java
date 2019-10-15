package www.epochong.jisuanke.base;

import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/4/25 18:45
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_12_Robot {
    public static void run(int[] arr, String str, int steps) {
        /*if (steps < 0) {
            if (str.equals("back")) {
                str = "forward";
            } else if (str.equals("right")) {
                str = "left";
            } else if (str.equals("left")) {
                str = "right";
            }
            steps = -steps;
        }*/
        if (arr[2] == 1) {
            switch(str){
                case "back":
                    arr[0] -= steps;
                    arr[2] = 3;
                    break;
                case "left":
                    arr[1] += steps;
                    arr[2] = 2;
                    break;
                case "right":
                    arr[1] -= steps;
                    arr[2] = 4;
                    break;
                case "forward" :
                    arr[0] += steps;
                default:
                    break;
            }
        } else if (arr[2] == 2) {
            switch(str){
                case "back":
                    arr[1] -= steps;
                    arr[2] = 4;
                    break;
                case "left":
                    arr[0] -= steps;
                    arr[2] = 3;
                    break;
                case "right":
                    arr[0] += steps;
                    arr[2] = 1;
                    break;
                case "forward" :
                    arr[1] += steps;

                default:
                    break;
            }
        } else if (arr[2] == 3) {
            switch(str){
                case "back":
                    arr[0] += steps;
                    arr[2] = 1;
                    break;
                case "left":
                    arr[1] -= steps;
                    arr[2] = 4;
                    break;
                case "right":
                    arr[1] += steps;
                    arr[2] = 2;
                    break;
                case "forward" :
                    arr[0] -= steps;
                default:
                    break;
            }
        }else if (arr[2] == 4) {
            switch(str){
                case "back":
                    arr[1] += steps;
                    arr[2] = 2;
                    break;
                case "left":
                    arr[0] += steps;
                    arr[2] = 1;
                    break;
                case "right":
                    arr[0] -= steps;
                    arr[2] = 3;
                    break;
                case "forward" :
                    arr[1] -= steps;
                default:
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str;
        int steps;
        int[] XYFace = {0,0,1};
        for (int i = 0; i < n; i++) {
            str = input.next();
            steps = input.nextInt();
            run(XYFace,str,steps);
        }
        System.out.println(XYFace[0] + " " + XYFace[1]);
    }
}
