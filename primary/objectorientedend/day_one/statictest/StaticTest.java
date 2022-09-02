package primary.objectorientedend.day_one.statictest;

public class StaticTest {
    public static void main(String[] args) {

        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "CHN";

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;
        c2.nation = "China";
        System.out.println(c1.nation);

        c1.eat();
        c1.show();
        Chinese.show();

    }
}
class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("吃饭");
    }
    public static void show(){
        System.out.println("我是中国人");
    }

}
