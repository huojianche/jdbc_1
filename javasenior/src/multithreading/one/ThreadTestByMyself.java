package multithreading.one;

/**
 * @author HF_Lee
 * @create 2022-07-07-11:01
 */

class myThread_1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" +i);
        }
    }
}
public class ThreadTestByMyself {
    public static void main(String[] args) {
        myThread_1 t2 = new myThread_1();
        t2.start();
        myThread_1 t3 = new myThread_1();
        t3.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "\tmain" + i);
        }
    }
}
