package draft.Stringexer;

import org.junit.Test;

/**
 * @author HF_Lee
 * @create 2022-07-13-15:45
 */
public class StringDemoTwo {

    /*
    获取一个字符串在另一个字符串中出现的次数
    比如：获取“ab”在“abkkcadkabkebfkabkskab”中出现的次数
     */

    public int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int index;
        int count = 0;
        if(mainLength >= subLength){
            while((index = mainStr.indexOf(subStr)) != -1){
                count++;
                mainStr = mainStr.substring(index + subLength);
            }
        }
        return count;
    }
    @Test
    public void test1(){
        String mainStr = "abkkcadkabkebfkabkskab";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);
    }
}
