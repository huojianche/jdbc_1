package primary.objectorientedend.day_four.usbtest;
/*
*接口的使用
 */
public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        //1、创建了接口的非匿名实现类非非匿名对象
        Flash flash = new Flash();
        com.transferDate(flash);
        //2、创建了接口的非匿名实现类的匿名对象
        com.transferDate(new Printer());
        //3、创建了接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        com.transferDate(phone);
        //4、创建了接口的匿名实现类的匿名对象
        com.transferDate(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });
    }
}
interface USB{

    void start();
    void stop();

}
class Computer{
    public void transferDate(USB usb){
        usb.start();
        System.out.println("具体传输细节");
        usb.stop();
    }
}
class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}