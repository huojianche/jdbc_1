package generic;

import org.junit.Test;

/**
 * @author HF_Lee
 * @create 2022-07-30-16:14
 */
public class GenericTest1 {

    @Test
    public void test(){
        //定义了泛型类，最好就要使用
        Order<String> order = new Order<String>("orderAA",1001,"AA");
        order.setOrderT("AA:hello");
    }
}
