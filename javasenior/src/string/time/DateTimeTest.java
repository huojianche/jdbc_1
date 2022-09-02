package string.time;

import org.junit.Test;

import java.util.Date;

/**
 * @author HF_Lee
 * @create 2022-07-13-10:41
 */
public class DateTimeTest {
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        Date date = new Date(time);
        System.out.println(date);
        System.out.println(time);
    }
    @Test
    public void test2(){
        Date date1 = new Date();
        System.out.println(date1);

        System.out.println(date1.getTime());
        Date date2 = new Date(1657680890762L);
        System.out.println(date2);

        java.sql.Date date3 = new java.sql.Date(12312312312L);
        System.out.println(date3);
    }


}
