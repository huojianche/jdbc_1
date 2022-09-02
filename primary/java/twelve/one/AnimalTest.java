package primary.java.twelve.one;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shut();
    }
}
class Animal{

    public void eat(){
        System.out.println("动物，进食");
    }
    public void shut(){
        System.out.println("动物，叫");
    }
}


class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void shut() {
        System.out.println("汪！汪！汪！");
    }
}


class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void shut() {
        System.out.println("喵！喵！喵！");
    }
}
