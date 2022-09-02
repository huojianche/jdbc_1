package primary.objectorientedend.day_one.singleton.singleton1;
//饿汉式单例设计模式
public class SingleTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }
}

class Bank{
    //1.私有化构造器
    private Bank(){

    }
    //2.内部创建类的对象
    //4.此对象必须声明为static
    private static Bank instance = new Bank();
    //3.提供公共的方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}