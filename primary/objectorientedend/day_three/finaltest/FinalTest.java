package primary.objectorientedend.day_three.finaltest;

/*
*final可以用来修饰结构、类、方法、变量
*1、用final修饰一个类，那么这个类就不能再被继承了
* 2、用final修饰方法，就表明这个方法不能被重写
* 3、用final修饰变量，那么这个“变量”就称为是一个常量了
*   3.1、用final修饰属性，可以考虑的赋值位置有显示初始化、代码块中初始化、构造器中初始化
*   3.2final修饰局部变量
*       尤其是使用final修饰形参时，表明此形参是一个常量，我们在调用此方法时，
*       给这个常量赋一个实参后，在这个方法内只能使用这个形参，不能重新赋值。
*
* static final 用来修饰全局常量、属性
 */
public class FinalTest {
    final int width = 10;

//    public void doWidth(){
//        width = 20;
//    }

}

final class FinalA{

}
//class B extends FinalA{}

class AA {

    final public void show(){
        System.out.println("123");
    }
}
//class BB extends AA{
//    @Override
//    public void show() {
//        super.show();
//    }
//}



