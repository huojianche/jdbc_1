package primary.athefei.construct;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();

        p.eat();
        Person p1 = new Person("Tom");
        p1.setAge(2);
        System.out.println(p1.name + "\t" + p1.getAge());
    }
}
class Person{
    String name;
    int age;

    //构造器
    public Person(){
        age = 18;
    }
    public Person(String n){
        age = 18;
        name = n;

    }


    public void eat(){
        System.out.println("人吃饭");
    }

    public void study(){
        System.out.println("人可以学习");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
