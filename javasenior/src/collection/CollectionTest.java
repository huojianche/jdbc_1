package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * 数组在内存存储方面的特点：
 *      数组初始化以后，长度就确定了。
 *      数组声明的类型，就决定了进行元素初始化时的类型
 * 数组在存储数据方面的弊端：
 *      数组初始化以后，长度就不可变了，不便于扩展
 *      数组中提供的属性和方法少，不便于进行添加、删除、插入等操作，且效率不高。同时无法直接获取存储元素的个数
 *      数组存储的数据是有序的、可以重复的。---->存储数据的特点单一
 *
 *
 * Collection接口：单列数据，定义了存取一组对象的方法的集合
 *    List：元素有序、可重复的集合   "动态数组"
 *       (ArrayList、LinkedList、Vector)
 *    Set：元素无序、不可重复的集合
 *       (HashSet、LinkedHashSet、TreeSet)
 *  Map接口：双列数据，保存具有映射关系“key-value对”的集合
 *        (HashMap、LinkedHashMap、TreeMap、Hashtable、Properties)
 *
 * @author HF_Lee
 * @create 2022-07-20-11:02
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();

        //add(Object e):将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

        //size():获取添加的元素个数
        System.out.println(coll.size());

        //addAll(Collection coll1):将coll1集合中的所有元素添加到当前集合中
        Collection coll1 = new ArrayList();
        coll1.add("CC");
        coll1.add(456);
        coll.addAll(coll1);

        System.out.println(coll.size());//6
        System.out.println(coll);

        //clear():清空集合元素
        coll.clear();

        //isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());
    }
}
