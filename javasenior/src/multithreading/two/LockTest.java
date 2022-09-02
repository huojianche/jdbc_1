package multithreading.two;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author HF_Lee
 * @create 2022-07-11-11:12
 */
class Lock1 implements Runnable{

    private static int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try{
                lock.lock();
                if (ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "\t" + "票号为:" + ticket);
                    ticket--;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Lock1 t = new Lock1();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}
