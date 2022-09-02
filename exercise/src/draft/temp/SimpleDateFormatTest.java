package draft.temp;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author HF_Lee
 * @create 2022-07-14-20:09
 */
public class SimpleDateFormatTest {
    @Test
    public void test() throws ParseException {

        String str = "2012-04-05";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(str);
        System.out.println(date);


    }
}
