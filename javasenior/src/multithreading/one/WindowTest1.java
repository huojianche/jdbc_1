package multithreading.one;

/**
 * 使用Runnable接口实现三个窗口卖票
 *
 * @author HF_Lee
 * @create 2022-07-07-15:58
 */

class myThread1 implements Runnable{
    private static int tickets = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if (tickets > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为:" + tickets);
                    tickets--;
                }else{
                    break;
                }
            }
        }
    }
}
public class WindowTest1 {
    public static void main(String[] args) {
        myThread1 m1 = new myThread1();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
