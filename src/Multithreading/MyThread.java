package Multithreading;

public class MyThread extends Thread {
    private Object lock;

    public MyThread(Object obj) {
        this.lock = obj;
    }


    @Override
    public void run() {

        int i = 0;
        while (i < 10) {
            synchronized (lock) {
                try {
                    System.out.println( i + ": " + Thread.currentThread().getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
                i++;
            }
        }
    }
}

