package draft.Stringexer;

import org.junit.Test;

/**
 * @author HF_Lee
 * @create 2022-07-13-14:45
 */
public class StringDemoOne {
    /*
    将一个字符串进行反转，将字符串中指定部分进行反转，比如“abcdefg”反转为“abfedcg”
     */
    public String reverse(String str,int startIndex,int endIndex){

        char[] ch = str.toCharArray();
        for(int i = startIndex, j = endIndex;i < j;i++,j--){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        String str1 = new String(ch);

        return str1;

    }
    public String reverse1(String str,int startIndex,int endIndex){

        StringBuilder builder = new StringBuilder(str.length());
        builder.append(str.substring(0,startIndex));
        for (int i = endIndex; i >= startIndex ; i--) {
            builder.append(str.charAt(i));
        }
        builder.append(str.substring(endIndex + 1));
        return builder.toString();
    }

    @Test
    public void test1(){
        String str = "abcdefg";
        String str1 = reverse(str,1,3);
        System.out.println(str1);
    }
    @Test
    public void test2(){
        String str = "abcdefg";
        String str1 = reverse1(str,1,3);
        System.out.println(str1);
    }


}
