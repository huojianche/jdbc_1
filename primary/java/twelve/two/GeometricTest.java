package primary.java.twelve.two;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle(2.3,"white",1.0);
        test.displayGeometricObject(c1);
        Circle c2 = new Circle(3.3,"white",1.0);
        test.displayGeometricObject(c2);

        boolean isEqual = test.equalsArea(c1,c2);
        System.out.println(isEqual);
    }

    public void displayGeometricObject(GeometricObject o){
        System.out.println("面积为：" + o.findArea());
    }

    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }
}
