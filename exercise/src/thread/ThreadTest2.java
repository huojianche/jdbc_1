package thread;

/**
 * @author HF_Lee
 * @create 2022-07-09-20:36
 */
class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
        }
    }
}
public class ThreadTest2 {
    public static void main(String[] args) {
        Thread2 t2 = new Thread2();
        Thread m1 = new Thread(t2);
        m1.setName("线程一");
        m1.start();
    }
}
