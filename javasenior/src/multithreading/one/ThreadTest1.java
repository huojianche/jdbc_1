package multithreading.one;

/**
 * 创建多线程的方法二:实现Runnable()接口
 * 1、创建一个实现了Runnable()接口的类
 * 2、实现类去实现runnable中的抽象方法:run()
 * 3、创建实现类的对象
 * 4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5、通过Thread类的对象调用start()
 *
 *
 * @author HF_Lee
 * @create 2022-07-07-15:38
 */
class thread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i < 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        Thread T1 = new Thread(t1);
        T1.start();
    }
}
