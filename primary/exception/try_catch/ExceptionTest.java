package primary.exception.try_catch;


import org.junit.Test;

/*
*try{
*   //可能出现异常的代码
* }catch(异常类型1 变量名1){
*   //处理异常的方式一
* }catch(异常类型2 变量名2){
 *   //处理异常的方式二
 * }catch(异常类型3 变量名3){
 *   //处理异常的方式三
 * }
 * ...
 * finally{
 *   //一定会执行的代码
 * }
 *
 * 常用的处理异常方式：① String getMessage()  ② printStackTrace()
 * try-catch-finally是处理编译时异常，是将一个编译时可能出现的错误延迟到运行时再出现。
 * try-catch-finally结构可以嵌套
 */
public class ExceptionTest {

    @Test
    public void test1(){
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("出现数值转换异常");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        }
}

