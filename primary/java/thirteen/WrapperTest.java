package primary.java.thirteen;

import org.junit.Test;

public class WrapperTest {
    @Test
    public void test1(){
        //基本数据局类型-->包装类
        int num1 = 10;
        //Integer in1 = new Integer(num1);
        Integer in1 = num1;
        System.out.println(in1.toString());

        //Integer in2 = new Integer(123);
        Integer in2 = 123;
        System.out.println(in2.toString());

        //Float f1 = new Float("12.3");
        Float f1 = 12.3f;
        System.out.println(f1.toString());
    }
    @Test
    public void test2(){
        //包装类-->基本数据局类型
        //Integer in1 = new Integer(12);
        Integer in1 = 12;
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        //Float f1 = new Float(12.3);
        Float f1 = 12.3f;
        float fl1 = f1.floatValue();
        System.out.println(fl1 + 1);

    }
    @Test
    public void test3(){
        //自动装箱
        int num2 = 10;
        Integer in2 = num2;

        boolean b1 = true;
        Boolean b2 = b1;

        //自动拆箱
        int num3 = in2;

    }
    @Test
    public void test4(){
        //基本数据类型、包装类-->String类型
        //方式一
        int num1 = 10;
        String s1 = num1 + "";
        //方式二
        float f1 = 12.3f;
        String str1 = String.valueOf(f1);

        //Double d1 = new Double(12.3);
        Double d1 = 12.3;
        String str2 = String.valueOf(d1);
    }
    @Test
    public void test5(){
        //String类型-->基本数据类型、包装类
        String str = "123";
        int num1 = Integer.parseInt(str);
    }
}
