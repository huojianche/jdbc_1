package multithreading.one.exer;

/**
 * @author HF_Lee
 * @create 2022-07-07-11:21
 */

//class threadOne extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0){
//                System.out.println(Thread.currentThread().getName() + "\t" + i);
//            }
//        }
//    }
//}
//class threadTwo extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 1){
//                System.out.println(Thread.currentThread().getName() + "\t" + i);
//            }
//        }
//    }
//}
public class ThreadDemo {
    public static void main(String[] args) {
//        threadOne t1 = new threadOne();
//        t1.start();
//        threadTwo t2 = new threadTwo();
//        t2.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + "\t" + i);
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 1){
                        System.out.println(Thread.currentThread().getName() + "\t" + i);
                    }
                }
            }
        }.start();
    }
}
