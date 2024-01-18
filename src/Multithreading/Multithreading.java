package Multithreading;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        Multithreading m = new Multithreading();
        //---------------- Задание №1 ------------------
//        m.makeTreadsTask1(10);
        //---------------- Задание №2 ------------------
//        Thread thread = new Thread(new Runner());
//        System.out.println("Состояние перед запуском: " + thread.getState());
//        thread.start();
//        System.out.println("Состояние во время выполнения: " + thread.getState());
//        thread.join();
//        System.out.println("Состояние после запуска: " + thread.getState());
        //---------------- Задание №3 ------------------
//        Counter c = new Counter();
//        m.makeTreadsTask3(100, 1000, c);
        //---------------- Задание №4 ------------------
        Object lock = new Object();
        MyThread threadOne = new MyThread(lock);
        MyThread threadTwo = new MyThread(lock);
        threadOne.start();
        threadTwo.start();
    }

    public void makeTreadsTask1(int amountThreads) {
        for (int i = 0; i < amountThreads; i++) {
            Thread thread = new Thread(new Runner());
            thread.start();
        }
    }

    public void makeTreadsTask3(int amountThreads, int amountCallIncrement, Counter c) throws InterruptedException {
        int count;
        for (int i = 0; i < amountThreads; i++) {
            Thread thread = new Thread(new Runner());
            thread.start();
            for (int j = 0; j < amountCallIncrement; j++) {
                c.increment();
            }
        }
        Thread.sleep(100);
        count = c.getCount();
        System.out.println("count = " + count);
    }

}


class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
