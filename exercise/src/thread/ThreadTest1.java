package thread;

/**
 * @author HF_Lee
 * @create 2022-07-09-20:28
 */
class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(getName() + "\t" + i);
            }
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.setName("线程一");
        t1.start();
    }

}
