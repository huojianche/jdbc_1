package primary.athefei.test.test;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(3);
        System.out.println("Tom新年龄为：" + newAge);
    }
}
