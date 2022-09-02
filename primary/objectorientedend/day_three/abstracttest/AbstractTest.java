package primary.objectorientedend.day_three.abstracttest;

/*
*abstract迎来修饰结构、类、方法
*   1、abstract修饰类-------抽象类
*   (1)用abstract修饰类后就不能实例化了
*   (2)抽象类中一定有构造器，便于子类实例化
*
*   2、abstract修饰方法------抽象方法（只有方法的声明，没有方法体）
*   (1)包含抽象方法的类一定是个抽象类。抽象类中不一定有抽象方法
*   (2)如果子类重写了父类中的所有的抽象方法，此类可以实例化
*   (3)如果子类没有重写父类中的所有方法，此类也是一个抽象类，需要用abstract修饰
*
* abstract使用注意点：
*   （1）、abstract不能用来修饰属性、构造器等结构
*   （2）、abstract不能用来修饰私有方法、静态方法、final的方法
 */
public class AbstractTest {
    public static void main(String[] args) {
        //Person类抽象了，不能实例化了
//        Person p1 = new Person();
//        p1.eat();
    }
}

abstract class Person{
    String name;
    int age;

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //抽象方法
    public abstract void eat();
//    public void eat(){
//        System.out.println("吃饭");
//    }
    public void walk(){
        System.out.println("走路");
    }
}
abstract class Student extends Person{

    public Student(String name,int age){
        super(name,age);
    }

//    public void eat(){
//        System.out.println("学生吃饭");
//    }
}
