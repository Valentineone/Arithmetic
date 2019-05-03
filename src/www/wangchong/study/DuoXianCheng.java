package www.wangchong.study;

import java.util.Scanner;
import java.util.Timer;

public class DuoXianCheng {
    public static void main(String[] args) {

        new Thread(() ->{
            int time = 0;
            new Timer().schedule(new MyTimerTask1(), 2000);
            // 下面这段代码是每隔1秒,打印下当前的时间
            while (true) {
                try {
                    /*Date date  = new Date();
                    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    System.out.println(s.format(date));*/
                    if (++time == 10) {
                        break;
                    }
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        ).start();
        new Thread(() -> {
            Scanner input = new Scanner(System.in);
            int x = 0;
            for (int i = 0; i < 4; i++) {
                x = input.nextInt();
                System.out.println(x);
            }


        }).start();
    }
}
