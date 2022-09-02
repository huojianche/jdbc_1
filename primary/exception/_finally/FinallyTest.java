package primary.exception._finally;

import org.junit.Test;

public class FinallyTest {

    @Test
    public void test1(){
        try{
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("一定会执行的代码");
        }
    }
}
