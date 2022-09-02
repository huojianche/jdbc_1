package collection.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author HF_Lee
 * @create 2022-07-27-17:34
 */
public class TreeSetTest {

    /*
    1,TreeSet中添加的对象必须是同类型的
    2,两种排序方式：自然排序 和 定制排序
    3,自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals().
     */
    @Test
    public void test(){
        TreeSet set = new TreeSet();

//        set.add(123);
//        set.add(456);
//        set.add("AA");
//        set.add(new User("TOM",25));

        //举例一
//        set.add(34);
//        set.add(-34);
//        set.add(11);
//        set.add(43);
//        set.add(8);

        //举例二
        set.add(new User("Tom",12));
        set.add(new User("Jerry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Jack",33));
        set.add(new User("Jack",22));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test1(){
        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };
        TreeSet set = new TreeSet(com);
        set.add(new User("Tom",12));
        set.add(new User("Jerry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Jack",33));
        set.add(new User("Jack",22));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
