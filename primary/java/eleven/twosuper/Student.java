package primary.java.eleven.twosuper;

public class Student extends Person {
    String major;

    public Student(){

    }
    public Student(String major){
        this.major = major;
    }
    public Student(String name,int age,String major){
        super(name,age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }
    public void study(){
        System.out.println("学生，学习知识");
    }
}
