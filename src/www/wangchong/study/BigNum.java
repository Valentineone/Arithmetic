package www.wangchong.study;


import java.math.BigDecimal;
import java.util.Scanner;

public class BigNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dou1 = 0.09;
        double dou2 = 0.01;
        System.out.println(dou1 + dou2);
        BigDecimal bd1 = new BigDecimal("0.09");//传递字符串时准的
        BigDecimal bd2 = BigDecimal.valueOf(0.01);//定义一个大数字的另一种方式
        BigDecimal bd22 = new BigDecimal(0.01);//直接传数值不准
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.add(bd22));
        System.out.println("ji suan cimi");
        System.out.println("dishu:");
        int a = input.nextInt();
        System.out.println("zhishu:");
        int b = input.nextInt();
        long d1 = System.currentTimeMillis();
        BigDecimal num = new BigDecimal(a);
        BigDecimal pow = new BigDecimal(num.pow(b).toString());
        long d2 = System.currentTimeMillis();
        System.out.println(pow.toString());
        System.out.println("time:" + (d2 - d1));
    }
}
