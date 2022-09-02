package multithreading.two;

import java.util.Date;

/**
 * @author HF_Lee
 * @create 2022-07-11-8:28
 */
class Thread1 implements Runnable{

    Object obj = new Object();
    private int tickets = 100;
    @Override
    public void run() {
        while(true){
            synchronized (Thread1.class){
                if(tickets > 0){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "\t" + "票号为:" + tickets);
                    tickets--;
                }else{
                    break;
                }
            }
        }
    }
}
public class Asynchronous {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();

        Thread m1 = new Thread(t1);
        Thread m2 = new Thread(t1);
        Thread m3 = new Thread(t1);

        m1.setName("窗口一");
        m2.setName("窗口二");
        m3.setName("窗口三");

        m1.start();
        m2.start();
        m3.start();
    }
}
