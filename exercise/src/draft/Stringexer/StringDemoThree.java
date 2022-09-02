package draft.Stringexer;

import org.junit.Test;

/**
 * @author HF_Lee
 * @create 2022-07-13-17:10
 */
public class StringDemoThree {
    /*
    获取两个字符串中最大相同子串。比如：
    str1 = "abcwerthelloyuiodefabcdef"; str2 = "cvhellobnm";
    提示:将短的那个串进行长度依次递减的子串与较长的子串比较。
     */
    public String getMaxSameString(String str1,String str2){
        if(str1 != null && str2 != null){
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();

            for (int i = 0;i < length;i++){
                for(int x = 0,y = length - i;y <= length;x++,y++){
                    String subStr = minStr.substring(x,y);
                    if(maxStr.contains(subStr)){
                        return subStr;
                    }
                }
            }
        }

        return null;
    }
    @Test
    public void test(){
        String str1 = "abcwerthelloyuiodefabcdef";
        String str2 = "cvhellobnm";
        String maxSameString = getMaxSameString(str1,str2);
        System.out.println(maxSameString);

    }
}
