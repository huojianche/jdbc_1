package collection.map;

import org.junit.Test;

import java.util.*;

/**
 * @author HF_Lee
 * @create 2022-07-28-22:12
 * Map:双列数据，存储key-value对的数据
 *     HashMap:作为Map的主要实现类；线程不安全的，效率高；可以存储null的key和value
 *         LinkedHashMap:保证在遍历map元素时，可以按照添加的顺序实现遍历。
 *     TreeMap；保证添加的key-value对进行排序，实现遍历
 *     HashTable:作为古老的实现类；线程安全的，效率低；不能存储null的key和value
 *         properties:常用来处理配置文件，key和value都是String类型
 *
 * Map常用方法:
 *   添加、删除、修改操作：
 *      Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
 *      void putAll(Map m):将m中的所有key-value对存放到当前map中
 *      Object remove(Object key)：移除指定key的key-value对，并返回value
 *      void clear()：清空当前map中的所有数据
 *   元素查询的操作：
 *       Object get(Object key)：获取指定key对应的value
 *       boolean containsKey(Object key)：是否包含指定的key
 *       boolean containsValue(Object value)：是否包含指定的value
 *       int size()：返回map中key-value对的个数
 *       boolean isEmpty()：判断当前map是否为空
 *       boolean equals(Object obj)：判断当前map和参数对象obj是否相等
 *    元视图操作的方法：
 *       Set keySet()：返回所有key构成的Set集合
 *       Collection values()：返回所有value构成的Collection集合
 *       Set entrySet()：返回所有key-value对构成的Set集合
 *
 */
public class MapTest {

    /*
    元视图操作的方法：
 *       Set keySet()：返回所有key构成的Set集合
 *       Collection values()：返回所有value构成的Collection集合
 *       Set entrySet()：返回所有key-value对构成的Set集合


     */
    @Test
    public void test5(){
        HashMap map = new HashMap();
        map.put("AA",123);
        map.put("BB",123);
        map.put("CC",56);

        //遍历所有的Key集:keySet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历所有的value集:values()
        Collection values = map.values();
        for(Object obj : values){
            System.out.println(obj);
        }

        //遍历所有key-value对构成的Set集合
        Set entrySet = map.entrySet();
        System.out.println(entrySet);
    }

    /*
    元素查询的操作：
 *       Object get(Object key)：获取指定key对应的value
 *       boolean containsKey(Object key)：是否包含指定的key
 *       boolean containsValue(Object value)：是否包含指定的value
 *       int size()：返回map中key-value对的个数
 *       boolean isEmpty()：判断当前map是否为空
 *       boolean equals(Object obj)：判断当前map和参数对象obj是否相等
     */
    @Test
    public void test4(){
        HashMap map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);

        System.out.println(map.get("AA"));//123
        System.out.println(map.containsKey("AA"));//true
        System.out.println(map.containsValue(123));//true
        System.out.println(map.size());//3
        System.out.println(map.isEmpty());//false

        HashMap map1 = new HashMap();
        map1.put("AA",123);
        map1.put(45,123);
        map1.put("BB",56);
        System.out.println(map.equals(map1));
    }

    /*
    添加、删除、修改操作：
 *      Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
 *      void putAll(Map m):将m中的所有key-value对存放到当前map中
 *      Object remove(Object key)：移除指定key的key-value对，并返回value
 *      void clear()：清空当前map中的所有数据
     */
    @Test
    public void test3(){
        HashMap map = new HashMap();
        //添加
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        //修改
        map.put("AA",87);

        System.out.println(map);

        HashMap map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);
        map.putAll(map1);
        System.out.println(map);

        //remove(Object key)
        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);
    }

    @Test
    public void test2(){
//        HashMap map = new HashMap();
        LinkedHashMap map = new LinkedHashMap<>();
        map.put(123,"AA");
        map.put(23,"BB");
        map.put(321,"CC");
        System.out.println(map);

        //clear()
        map.clear();
        System.out.println(map.size());
    }
    @Test
    public void test1(){

        Map hashMap = new HashMap();
        hashMap.put(null,123);

    }
}
