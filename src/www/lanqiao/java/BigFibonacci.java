package www.lanqiao.java;

import java.math.BigDecimal;

public class BigFibonacci {
    public static BigDecimal fibonacci(int n) {
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("1");
        BigDecimal c = new BigDecimal("1");
        for (int i = 3; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(2019));
    }
}
