package multithreading.two;



/**
 * @author HF_Lee
 * @create 2022-07-11-9:57
 */
class myThread2 implements Runnable{
    private static int tickets = 100;
    @Override
    public void run() {
        while(true){
            show();
        }
        }

    private synchronized void show(){

                if (tickets > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为:" + tickets);
                    tickets--;
                }

    }
}
public class Asynchronous2 {
    public static void main(String[] args) {
        myThread2 m1 = new myThread2();

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
