package www.epochong.lanqiao.java;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        final double m=3.14159265358979323;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double s=m*r*r;
        DecimalFormat df=new DecimalFormat("#.0000000");
        System.out.println(df.format(s));

    }
}
