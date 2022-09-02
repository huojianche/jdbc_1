package string.time;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1、System中currentTimeMillis()
 * 2、java,util.Date和子类java.sql.Date
 * 3、SimpleDateFormat
 * 4、Calendar
 * @author HF_Lee
 * @create 2022-07-14-10:39
 */
public class DateTimeTest1 {


    @Test
    public void testSimpleDateFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        String str = "2022-07-14 上午11:23";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date2 = new Date();
        String format1 = sdf1.format(date2);
        System.out.println(format1);

    }
    /*
    将字符串"2020-09-08"转换为java.sql.Date
     */
    @Test
    public void test() throws ParseException {
        String date = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2020-09-08");
        java.sql.Date birthday = new java.sql.Date(date1.getTime());
        System.out.println(birthday);
    }
}
