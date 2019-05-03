package www.homework.java.Chapter10;

import java.util.concurrent.FutureTask;

public class AddThreadTest {
    public static void main(String[] args) {
        int i = 0;
        AddThread addThread = new AddThread(i + 1);
        FutureTask<Object> task1 = new FutureTask<>(addThread);
        Thread thread1 = new Thread(task1,"add1");
        thread1.start();
        i += 10;
        FutureTask<Object> task2 = new FutureTask(addThread);
        Thread thread2 = new Thread(task2,"add2");
        thread2.start();
        i += 10;
        FutureTask<Object> task3 = new FutureTask(addThread);
        Thread thread3 = new Thread(task3,"add3");
        thread3.start();
        i += 10;
        FutureTask<Object> task4 = new FutureTask(addThread);
        Thread thread4 = new Thread(task4,"add4");
        i += 10;
        thread4.start();
        FutureTask<Object> task5 = new FutureTask(addThread);
        Thread thread5 = new Thread(task5,"add5");
        i += 10;
        thread5.start();
        AddThread addThread6 = new AddThread(i + 1);
        FutureTask<Object> task6 = new FutureTask(addThread);
        Thread thread6 = new Thread(task6,"add6");
        thread6.start();
        i += 10;
        AddThread addThread7 = new AddThread(i + 1);
        FutureTask<Object> task7 = new FutureTask(addThread);
        Thread thread7 = new Thread(task7,"add7");
        i += 10;
        thread7.start();
        AddThread addThread8 = new AddThread(i + 1);
        FutureTask task8 = new FutureTask(addThread);
        Thread thread8 = new Thread(task8,"add8");
        i += 10;
        thread8.start();
        AddThread addThread9 = new AddThread(i + 1);
        FutureTask task9 = new FutureTask(addThread);
        Thread thread9 = new Thread(task9,"add9");
        i += 10;
        thread9.start();
        AddThread addThread10 = new AddThread(i + 1);
        FutureTask task10 = new FutureTask(addThread);
        Thread thread10 = new Thread(task10,"add10");
        thread10.start();

        //System.out.println(task1.get());

    }
}
