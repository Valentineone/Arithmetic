package www.epochong.lanqiao.java;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.StrictMath.atan;
//import static sort.lang.StrictMath.atan
/*问题描述
        给定圆的半径r，求圆的面积。
        输入格式
        输入包含一个整数r，表示圆的半径。
        输出格式
        输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
        说明：在本题中，输入是一个整数，但是输出是一个实数。
        对于实数输出的问题，请一定看清楚实数输出的要求，比如本题中要求保留小数点后7位，
        则你的程序必须严格的输出7位小数，输出过多或者过少的小数位数都是不行的，都会被认为错误。
        实数输出的问题如果没有特别说明，舍入都是按四舍五入进行。
        样例输入
        4
        样例输出
        50.2654825
        数据规模与约定
        1 <= r <= 10000。
        提示
        本题对精度要求较高，请注意π的值应该取较精确的值。你可以使用常量来表示π，
        比如PI=3.14159265358979323，也可以使用数学公式来求π，比如PI=atan(1.0)*4。*/
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radio = input.nextInt();
        System.out.println(areaOfCircle(radio));
    }
    public static Double areaOfCircle(int radio) {
        double area ;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(7);
        area = Math.PI * radio * radio;
        area = Double.valueOf( nf.format(area));
        return area;
    }
/*    double d = 10.2345;
    NumberFormat nf=NumberFormat.getNumberInstance() ;
        nf.setMaximumFractionDigits(2);
    String s= nf.format(d) ;
        System.out.println("s1:" + s);

        nf.setMaximumFractionDigits(3);
    s= nf.format(d) ;
        System.out.println("s2:" + s);*/
}
