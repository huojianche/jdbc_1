package primary.athefei.contact;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        System.out.println(p1.name);

        //调用方法
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        Person p2 = p1;
        p2.age = 10;
        System.out.println(p1.age);
    }

}
class Person{
    //属性
    String name;
    int age = 1;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
     public void  sleep(){
         System.out.println("人可以睡觉");
     }
     public void talk(String language){
         System.out.println("人可以说话，使用的是：" + language);
     }
}
