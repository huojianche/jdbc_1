package primary.java.eleven.one;

public class Student extends Person {
    String major;

    public Student(){

    }
    public Student(String major){
        this.major = major;
    }

    public void study(){
        System.out.println("学习的专业是" + major);
    }

    public void eat(){
        System.out.println("学生吃营养餐");
    }
}
