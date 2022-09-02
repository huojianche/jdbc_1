package primary.objectorientedend.day_four.interfacetest;
/*
* 1、接口和类是并列结构
* 2、定义接口中的成员：
*   2、1JDK7以前，只能定义常量和抽象方法
*       >全局常量：public static final的，但是书写时可以省略不写
*       >抽象方法：public abstract的
*   2、2JDK8，除了定义常量和抽象方法，还可以定义静态方法和默认方法
*       2、2、1接口中定义的静态方法，只能通过接口调用
*       2、2、2通过实现类的对象，可以调用接口中的默认方法
*       2、2、3如果子类继承的父类和实现的接口中声明了同名同参数的方法，那么子类在没有重写此方法的情况下，默认调用的是父类的方法。
* 3、接口中不能定义构造器
* 4、java开发中，接口通过让类去实现（implement）的方式来实现使用
*   4、1如果实现类覆盖了接口中的所有抽象方法，则次实现类可以实例化
*   4、2如果实现类没有覆盖所有接口中的方法，则此实现类是抽象类
* 5、Java类可以实现多个接口---->弥补了java单继承性的局限性
* 6、接口与接口之间可以继承，而且可以多继承
*
* 7、接口的使用，体现了多态性
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane = new Plane();
        plane.fly();
    }

}
interface  Attackable{
    void attack();
}
interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;//省略了public static  final

    //抽相方法
    public abstract void fly();
    //省略了public abstract
    void stop();
}
class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}
abstract class Kite implements Flyable{
    @Override
    public void fly() {

    }
}
class Bullet implements Flyable,Attackable{

    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}
interface AA{

}
interface BB{

}
interface CC extends AA,BB{

}