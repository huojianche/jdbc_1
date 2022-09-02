package multithreading.one;

/**
 * 多线程的创建，方式一:
 *  1、创建一个继承于Thread类的子类
 *  2、重写Thread类的run()方法      将此线程的操作声明在run()方法中
 *  3、创建Thread类的子类的对象
 *  4、通过此对象调用start()
 *
 *  例子: 遍历100以内所有的偶数
 * @author HF_Lee
 * @create 2022-07-07-10:35
 */

//1、创建一个继承于Thread类的子类
class myThread extends Thread{
    //2、重写Thread类的run()方法
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        };
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3、创建Thread类的子类的对象
        myThread t1 = new myThread();
        //4、通过此对象调用start()
        t1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("hello  main" + i);
        }

    }
}

