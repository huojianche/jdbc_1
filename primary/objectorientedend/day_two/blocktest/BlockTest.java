package primary.objectorientedend.day_two.blocktest;

public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person p1 = new Person();
        Person p2 = new Person();
    }
}


class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //代码块
    //静态代码块：随着类的加载而执行，而且只执行一次
    static{
        System.out.println("Hello! Static block");
    }
    //非static代码块：随着对象的创建而执行，每创建一个对象，执行一次。在创建对象时，可以对对象的属性进行初始化
    {
        System.out.println("Hello! Block");
    }
    //方法
    public void eat(){
        System.out.println("吃饭");
    }
    public static void info(){
        System.out.println("我是一个快乐的人");

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}