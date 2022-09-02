package primary.exception.exception_example;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/*
*常见异常
 */
public class ExceptionTest {
    //****************************运行时异常***********************************//
    //NullPointerException空指针异常
    @Test
    public void test1(){
//        int[] arr = null;
//        System.out.println(arr[3]);

        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));
    }

    //ArrayIndexOutOfBoundException 数组角标越界
    @Test
    public void test2(){
        int[] arr = new int[2];
        System.out.println(arr[2]);
    }

    //ClassCastException 类型转换异常
    @Test
    public void test3(){
        Object obj = new Date();
        String str = (String)obj;
    }

    //NumberFormatException 数值转换异常
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }

    //InputMismatchException
    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("输入一个数字");
        System.out.println(num);
        scanner.close();
    }

    //ArithmeticException
    @Test
    public void test6(){
        int a = 10;
        int b= 0;
        System.out.println(a / b);
    }

    //****************************编译时异常***********************************//
//    @Test
//    public void test7(){
//        c
//    }
}
