package collection.map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author HF_Lee
 * @create 2022-07-29-15:00
 *
 * 常用方法:
 * 排序操作：（均为static方法）
 * reverse(List)：反转 List 中元素的顺序
 * shuffle(List)：对 List 集合元素进行随机排序
 * sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
 * sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
 * swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
 * 查找、替换
 * Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
 * Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回
 * 给定集合中的最大元素
 * Object min(Collection)
 * Object min(Collection，Comparator)
 * int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
 * void copy(List dest,List src)：将src中的内容复制到dest中 boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换
 * List 对象的所有旧值
 */
public class CollectionsTest{
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);
        System.out.println(list);
//        Collections.reverse(list);
//        Collections.shuffle(list);
//        Collections.sort(list);
//        Collections.sort(list, new Comparator<Object>() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if(o1 instanceof Integer && o2 instanceof Integer){
//                    Integer i1 = (Integer)o1;
//                    Integer i2 = (Integer)o2;
//                    return -(i1 - i2);
//                }else{
//                    throw new RuntimeException("输入的数据类型不匹配");
//                }
//            }
//        });
//        System.out.println(list);
    }


}
