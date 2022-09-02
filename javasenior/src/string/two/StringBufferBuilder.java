package string.two;

import org.junit.Test;

/**
 * @author HF_Lee
 * @create 2022-07-13-9:20
 */
public class StringBufferBuilder {

    @Test
    public void test1(){
        String str = "123";
        String str1 = str.substring(0,1);
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer("abc");
        str2.append("def");
        System.out.println(str2);
        System.out.println(str2.length());
    }

    /*StringBuffer常用方法：
    StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
    StringBuffer delete(int start,int end)：删除指定位置的内容
    StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
    StringBuffer insert(int offset, xxx)：在指定位置插入xxx
    StringBuffer reverse() ：把当前字符序列逆转
    public int indexOf(String str)
    public String substring(int start,int end)
    public int length()
    public char charAt(int n )
    public void setCharAt(int n ,char ch)
     */

    /*
 StringBuffer and StringBuilder重点：
 增：append()
 删：delete(int start,int end)
 改：setCharAt(int n,shar ch)  /  replace(int start,int end,String str)
 查：charAt(int n)
 插：insert(int offset,str)
 长度：length()
  */

    /*
    String, StringBuffer, StringBuilder区别:
    ①String 不可变的字符序列，底层使用char[]存储
    ②StringBuffer 可变的字符序列，线程安全，效率低，底层使用char[]存储
    ③StringBuilder 可变的字符序列， 线程不安全，效率高，底层使用char[]存储

    效率：  String < StringBuffer < StringBuilder
     */
    @Test
    public void test2(){
        StringBuffer s = new StringBuffer("abc");
        s.append(1);
        s.append("1");
        System.out.println(s);
        //s.delete(2,4);
        System.out.println(s);
        s.replace(2,4,"hello");
        System.out.println(s);
        s.insert(7,"world");
        System.out.println(s);
        StringBuffer s1 = new StringBuffer("abcdef");
        //s1.reverse();
        System.out.println(s1);
        System.out.println(s1.indexOf("c"));
        System.out.println(s1.substring(3, 6));
        s1.setCharAt(3,'D');
        System.out.println(s1);
    }

}
