package primary.objectorientedend.day_one.circletest;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println("创建圆的个数是：" + Circle.getTotal());
    }


}
class Circle{
    private double radius;
    private int id;

    public Circle(){
        id = init++;
        total++;
    }

    private static int total;
    private static int init = 1001;

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }
}
