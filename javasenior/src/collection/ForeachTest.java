package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author HF_Lee
 * @create 2022-07-20-16:22
 */
public class ForeachTest {

    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("TOM"));
        coll.add(false);
        coll.add(new Person("Jane",25));

        //for(集合元素的类型 局部变量 : 集合对象)
        for(Object obj : coll){
            System.out.println(obj);
        }
    }
    @Test
    public void test1(){
        int[] arr =new int[]{1,2,3,4,5,6};
        //for(数组元素的类型 局部变量 : 数组对象)
        for(int i : arr){
            System.out.println(i);
        }
    }
    @Test
    public void test2(){
        String[] arr = new String[]{"MM","MM","MM"};

        //方式一:普通for赋值
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "GG";
//        }

        //方式二:增强for循环
        for (String s : arr){
            s = "GG";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
