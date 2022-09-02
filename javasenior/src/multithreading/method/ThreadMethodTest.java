package multithreading.method;

/**
 *
 * 测试Thread中常用方法
 * 1、start():启动当前线程，调用run()方法
 * 2、run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3、currentThread():静态方法，返回执行当前代码的线程
 * 4、getName():获取当前线程的名字
 * 5、setName():设置当前线程的名字
 * 6、yield():释放当前cpu的执行
 * 7、join():在线程A中调用B的join(),此时线程A就进入阻塞状态直到线程B完全执行完后，线程A才结束阻塞状态
 * 8、stop(): 已过时，强制结束当前线程
 * 9、sleep(long millitime):让当前线程睡眠指定的millitime毫秒，在指定的毫秒内，当前线程为阻塞状态
 * 10、isAlive():判断当前想成是否存活
 *
 * 线程的优先级:优先级高是优先执行的概率比较高，并非一定先执行
 * 1、默认为5
 * MAX_PRIORITY:10
 * MIN_PRIORITY:1
 * NORM_PRIORITY:5
 * 2、
 *  getPriority():获取线程的优先级
 *  setPriority(int p):设置线程的优先级
 *
 * @author HF_Lee
 * @create 2022-07-07-11:39
 */

class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + getPriority() + "\t" + i);
            }
            if (i % 20 ==0){
                yield();
            }
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 1){
                System.out.println(Thread.currentThread().getName() + getPriority() + "\t" + i);
            }
        }
    }
}
public class ThreadMethodTest {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t2.setName("线程二");
        t2.start();
        t1.setName("线程一");
        t1.start();

        Thread.currentThread().setName("主线程");
        for (int i = 0;i < 100;i++){
            System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority() + "\t" + i);
            if (i == 31){
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
