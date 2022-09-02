package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HF_Lee
 * @create 2022-07-29-22:03
 */
public class GenericTest {

    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        //需求:存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);

        //问题一:类型不安全
//        list.add("Tom");

        for(Object score : list){
            //问题二:强转时，可能出现ClassCastException
            int stuScore = (Integer)score;
            System.out.println(stuScore);
        }
    }
    //在集合中使用泛型的情况
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);

        //编译时，就会进行类型检查，保证数据安全
//        list.add("Tom");
        for(Integer score : list){
            //避免强转操作
            int stuScore = score;
            System.out.println(stuScore);
        }
    }

    @Test
    public void test3(){
        Map<String,Integer> hashMap = new HashMap<String,Integer>();

    }

}
