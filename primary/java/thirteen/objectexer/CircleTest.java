package primary.java.thirteen.objectexer;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3,"white",2.0);
        Circle circle2 = new Circle(2.3);

        System.out.println("判断颜色是否一样" + circle1.getColor().equals(circle2.getColor()));
        System.out.println("判断半径是否相等" + circle1.equals(circle2));
        System.out.println(circle1.toString());
    }

}
