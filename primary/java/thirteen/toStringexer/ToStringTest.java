package primary.java.thirteen.toStringexer;

import primary.java.myproject02.Customer;

import java.util.Date;

public class ToStringTest {
    public static void main(String[] args) {
        Customer cust = new Customer();
        System.out.println(cust.toString());
        Date date = new Date(1221L);
        System.out.println(date.toString());
        String string = new String("MM");
        System.out.println(string.toString());
    }
}
