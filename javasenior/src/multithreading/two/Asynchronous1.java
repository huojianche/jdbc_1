package multithreading.two;

/**
 * @author HF_Lee
 * @create 2022-07-11-9:49
 */
class Thread2 extends Thread{

    private static int tickets = 100;
    @Override
    public void run() {
        while(true){
            show();
        }
    }
    private static synchronized void show(){
            if(tickets > 0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "\t" + "票号为:" + tickets);
                tickets--;
            }

    }
}
public class Asynchronous1 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        Thread2 t2 = new Thread2();
        Thread2 t3 = new Thread2();

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
