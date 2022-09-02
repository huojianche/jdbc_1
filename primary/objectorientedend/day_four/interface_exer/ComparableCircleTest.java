package primary.objectorientedend.day_four.interface_exer;

public class ComparableCircleTest {
    public static void main(String[] args) {
        CompareCircle c1 = new CompareCircle(3.4);
        CompareCircle c2 = new CompareCircle(3.6);
        
        int comparableValue = c1.compareTo(c2);
        System.out.println(comparableValue);
    }
}
