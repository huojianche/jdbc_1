package primary.athefei.test.test;

public class Person {
    String name;
    int age;
    /**
     sex:1表明是男性
     sex:0表明是女性
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age:" + age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
