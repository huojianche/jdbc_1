package primary.java.eleven.twosuper;

public class Person {
    String name;
    int age;

    public Person(){

    }
    public Person(String  name){
        this.name = name;
    }
    public  Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("人，吃饭");
    }
    public void walk(){
        System.out.println("人，走路");
    }
}
