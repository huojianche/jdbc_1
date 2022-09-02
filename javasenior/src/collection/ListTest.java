package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author HF_Lee
 * @create 2022-07-20-17:20
 *
 *面试题:ArrayList、LinkedList、Vector三者的异同？
 *  同:三个类都是实现List接口，存储数据局特点相同:存储有序的、可重复的数据
 *  不同:
 *  ArrayList: 作为List接口的主要实现类，线程不安全的，效率高；底层使用object[] elementData存储
 *  LinkedList: 对于频繁地插入、删除操作，使用此类的效率比ArrayList高，底层使用双向列表存储
 *  Vector: 作为List接口的古老实现类；线程是安全的、效率低；底层使用Object[] elementData存储
 *
 */
public class ListTest {
    /*
    List常用方法:
    void add(int index, Object ele):在index位置插入ele元素
    boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
    Object get(int index):获取指定index位置的元素
    int indexOf(Object obj):返回obj在集合中首次出现的位置
    int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
    Object remove(int index):移除指定index位置的元素，并返回此元素
    Object set(int index, Object ele):设置指定index位置的元素为ele
    List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
     */
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("TOM",25));
        list.add(456);

        System.out.println(list);

        //void add(int index, Object ele):在index位置插入ele元素
        list.add(0,"LL");
        System.out.println(list);

        //boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        ArrayList list1 = new ArrayList();
        list1.add("QQ");
        list1.add("WW");
        list1.add("EE");
        list.addAll(1,list1);
        System.out.println(list);

        //Object get(int index):获取指定index位置的元素
        System.out.println(list1.get(0));

        //int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list1.indexOf("WW"));

        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        System.out.println(list1.lastIndexOf("WW"));

        //Object remove(int index):移除指定index位置的元素，并返回此元素
        System.out.println(list1.remove(2));
        System.out.println(list1);

        //Object set(int index, Object ele):设置指定index位置的元素为ele
        list1.set(1,"PP");
        list1.add("好垃圾啊！");
        System.out.println(list1);

        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
        System.out.println(list.subList(1, 3));
    }
}
