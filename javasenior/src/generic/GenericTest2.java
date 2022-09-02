package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author HF_Lee
 * @create 2022-07-31-8:06
 *
 * 1.泛型在继承方面的体现
 *      类A和类B是子父类关系，G<A>和G<B>不具备子父类关系，是并列关系
 *
 * 2.通配符的使用
 *
 */
public class GenericTest2 {
    /*
    1.泛型在继承方面的体现
     */
    @Test
    public void test(){
        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;
        //list1 = list2;

        show(list1);
        show1(list2);

//        show(list2);
//        show(list1);
    }

    public void show(List<Object> list){}
    public void show1(List<String> list){}
    @Test
    public void test1(){
        List<String> list1 = null;
        ArrayList<String> list2 = null;

        list1 = list2;
    }

    /*
    2,通配符的使用：
       通配符: ?
    类A是类B的父类，G<A>和G<B>是没有关系的，二者共同的父类是G<?>
     */
    @Test
    public void test2(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;
        list = list1;

        //对于List<?>,不能添加数据，除了null
        //list.add("AA");

        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list = list3;
        list.add(null);


        //获取数据,读取的数据类型是Object
        Object o = list.get(0);
        System.out.println(o);


//        print(list1);
//        print(list2);
    }
    public void print(List<?> list){
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    /*
    3.有限制条件的通配符的使用
        ? extends A:
            G<? extends A> 可以作为G<A>和G<B>的父类，其中B是A的子类
        ? superA:
            G<? super A> 可以作为G<A>和G<B>的父类，其中B是A的父类
     */
    @Test
    public void test3(){
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = new ArrayList<Student>();
        List<Person> list4 = new ArrayList<Person>();
        List<Object> list5 = new ArrayList<Object>();

        list1 = list3;
        list1 = list4;
//        list1 = list5;
//        list2 = list3;
        list2 = list4;
        list2 = list5;

        //读取数据
        list1 = list3;
        Person p = list1.get(0);
//        Student s = list1.get(0);

        list2 = list4;
        Object obj = list2.get(0);
//        Person object = list2.get(0);

        //写入数据
//        list1.add(new Student());
        list2.add(new Person());
        list2.add(new Student());


    }

}
