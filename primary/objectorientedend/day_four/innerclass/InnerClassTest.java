package primary.objectorientedend.day_four.innerclass;
/*
*内部类：成员内部类vs局部内部类(方法内、代码块内、构造器内)
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建Dog实例（静态的成员内部类）
        Person.Dog dog = new Person.Dog();
        dog.show();
        //创建Bird实例（非静态的成员内部类）
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();
    }

}
class Person{
    //静态成员内部类
    static class Dog{
        public void show(){
            System.out.println("我是一只狗");
        }

    }
    //非静态成员内部类
    class Bird{
        public void sing(){
            System.out.println("我是一只小小鸟");
        }

    }
    public void method(){
        //局部内部类
        class AA{

        }
        {
            //局部内部类
            class BB{

            }
        }

    }
    public Person(){
        //局部内部类
        class CC{

        }
    }
}
