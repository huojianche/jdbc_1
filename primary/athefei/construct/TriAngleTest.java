package primary.athefei.construct;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(3.0);
        t1.setHeight(3.0);
        System.out.println("base:" + t1.getBase() + ",height:" + t1.getHeight());
        TriAngle t2 = new TriAngle(5.1,5.2);
        System.out.println("base:" + t2.getBase() + ",height:" + t2.getHeight());

    }
}
