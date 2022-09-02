package string.one;

import org.junit.Test;

/**
 * @author HF_Lee
 * @create 2022-07-12-18:02
 *  int length()：返回字符串的长度： return value.length
 *  char charAt(int index)： 返回某索引处的字符return value[index]
 *  boolean isEmpty()：判断是否是空字符串：return value.length == 0
 *  String toLowerCase()：使用默认语言环境，将 String 中的所有字符转换为小写
 *  String toUpperCase()：使用默认语言环境，将 String 中的所有字符转换为大写
 *  String trim()：返回字符串的副本，忽略前导空白和尾部空白
 *  boolean equals(Object obj)：比较字符串的内容是否相同
 *  boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大小写
 *  String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”
 *  int compareTo(String anotherString)：比较两个字符串的大小
 *  String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。
 *  String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。
 */
public class StringMethodTest {
    @Test
    public void test1(){
        String s1 = "HelloWorld";
        String s2 = "HelloWorld";
        String s3 = "helloworld";
        String s4 = "   Hello   ew";
        System.out.println(s1.length());//10
        System.out.println(s1.charAt(0));//H
        System.out.println(s1.isEmpty());//false
        System.out.println(s1.toLowerCase());//"helloworld"
        System.out.println(s1.toUpperCase());//"HELLOWORLD"
        System.out.println(s1.trim());//HelloWorld
        System.out.println(s4.trim());
        System.out.println(s1.equals(s2) + "\t" + s1.equals(s3));//true false
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println(s1.concat(" I am Chinese"));//HelloWorld I am Chinese
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.substring(5));//World
        System.out.println(s1.substring(0,5));//Hello
    }

}
