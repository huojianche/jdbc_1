package primary.exception.override;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
*方法重写规则之一:
*       子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
*
* 开发中如何选择使用try-catch-finally，还是throws？
*       如果父类被重写的方法没有throws处理异常，则子类重写的方法也不能使用throws，
*       意味着如果子类重写的方法有异常，比喻使用try-catch-finally方式处理。
 */
public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SubClass());
    }

    public void display(SuperClass s){
        try{
            s.method();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
class SuperClass{
    public void method() throws IOException {}
}
class SubClass extends SuperClass{
    public void method() throws FileNotFoundException{}
}
