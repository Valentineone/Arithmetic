package www.homework.java.Chapter10;

import java.util.concurrent.FutureTask;

public class AddThreadTest {
    class Add implements Runnable{

        @Override
        public void run() {

        }
    }
    public static void main(String[] args) {
        int i = 0;
        AddThread addThread = new AddThread(i + 1);
        FutureTask<Object> task1 = new FutureTask<>(addThread);
        Thread thread1 = new Thread(task1,"add1");
        thread1.start();
    }
}
