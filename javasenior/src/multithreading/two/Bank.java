package multithreading.two;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author HF_Lee
 * @create 2022-07-11-11:38
 */
class ThreadBank implements Runnable{
    ReentrantLock lock = new ReentrantLock();
    private static int account = 0;
    @Override
    public void run() {
        try{
            lock.lock();
            while(account < 3000){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account += 1000;
                System.out.println("账户余额为:" + account + "\t" + "存款人为:" + Thread.currentThread().getName());
            }
        }finally {
            lock.unlock();
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        ThreadBank t = new ThreadBank();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.setName("用户一");
        t2.setName("用户二");

        t1.start();
        t2.start();
    }
}
