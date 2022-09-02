package primary.java.ten;

public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age = 1;
        p1.eat();


        Student s1 = new Student();
        s1.eat();
        s1.sleep();
        System.out.println(s1.name);
    }
}
