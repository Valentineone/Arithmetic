package www.xiaomin_oj.oj;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class BigNum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> bigArr = new ArrayList<>();
        while (input.hasNextLine()) {
            bigArr.add(input.nextLine());
        }
        for (int i = 0; i < bigArr.size(); i++) {
            String jianShu = bigArr.get(i).substring(0,bigArr.indexOf("-"));
            String beiJianShu = bigArr.get(i).substring(bigArr.indexOf("-" + 1),bigArr.get(i).length());
            BigDecimal bigJianShu = new BigDecimal(jianShu);
            BigDecimal bigBeiJianShu = new BigDecimal(beiJianShu);
            System.out.println(bigJianShu.subtract(bigBeiJianShu));
        }

    }
}
