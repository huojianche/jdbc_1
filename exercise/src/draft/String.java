package draft;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author HF_Lee
 * @create 2022-07-12-21:38
 */
public class String {
    @Test
    public void test1(){
        java.lang.String str = "123";
        //String --> 基本数据类型
        int num = Integer.parseInt(str);
        System.out.println(num);

        //基本数据类型 --> String
        java.lang.String str1 = java.lang.String.valueOf(num);
        System.out.println(str1);
    }
    @Test
    public void test2(){
        java.lang.String str1 = "123abc";
        //String --> 字符数组
        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        //字符数组 --> String
        char[] ch = new char[]{'h','e','l','l','o'};
        java.lang.String str2 = new java.lang.String(ch);
        System.out.println(str2);
    }
    @Test
    public void test3(){
        java.lang.String str1 = "abc123中国";
        //String --> byte[]
        byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));

        //byte[] --> String
        java.lang.String str2 = new java.lang.String(bytes);
        System.out.println(str2);
    }

}
