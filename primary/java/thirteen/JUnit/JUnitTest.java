package primary.java.thirteen.JUnit;

import org.junit.Test;

public class JUnitTest {

    int num = 10;
    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));
        System.out.println(num);
    }
    @Test
    public void testToString(){
        String s = "abc";
        System.out.println(s.toString());
    }
}
