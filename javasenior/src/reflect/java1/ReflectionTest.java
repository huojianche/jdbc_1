package reflect.java1;

import org.junit.Test;
import reflect.java.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author HF_Lee
 * @create 2022-08-09-15:40
 *
 * 调用运行时类中指定的结构:属性、方法、构造器
 */
public class ReflectionTest {

    /*

     */
    @Test
    public void test1() throws Exception {
        Class clazz = Person.class;

        //创建运行时类的对象
        Person p = (Person) clazz.newInstance();
        //获取指定的属性,要求运行时类中声明的属性声明为public
        //通常不采用此方法
        Field id = clazz.getField("id");

        /*
        设置当前属性的值
        set():参数一:指明设置那个对象的属性   参数二:将此属性设置为多少
         */
        id.set(p,1001);

        /*
        获取当前属性的值
        get():参数一:获取哪个当前属性的值
         */
        Object pId = id.get(p);
        System.out.println(pId);

    }
    @Test
    public void test2() throws Exception {
        Class clazz = Person.class;

        //创建运行时类的对象
        Person p = (Person) clazz.newInstance();
        //1、getDeclaredField(String fieldName):获取运行时类中指定变量名的属性
        Field name = clazz.getDeclaredField("name");

        //2、保证当前属性是可访问的
        name.setAccessible(true);

        //3、获取、设置指定对象的属性值
        name.set(p,"Tom");
        System.out.println(name.get(p));
    }
    /*
    如何操作运行时类中的制定方法
     */
    @Test
    public void testMethod() throws Exception {
        Class clazz = Person.class;

        //创建运行时类的对象
        Person p = (Person) clazz.newInstance();


        //1、获取指定的某个方法
        /*
        getDeclaredMethod():参数一:指明获取参数的名称  参数二:指明获取参数的形参列表
         */
        Method show = clazz.getDeclaredMethod("show", String.class);
        //2、保证当前方法时可访问的
        show.setAccessible(true);
        /*
        invoke():参数一:方法的调用者 参数二:给方法赋值的实参
         */
        //3、调用invoke()   invoke()的返回值就是对应类中的方法的返回值
        Object returnValue = show.invoke(p, "CHN");
        System.out.println(returnValue);

        System.out.println("**************如何调用静态方法****************");

        //private static void showDesc()
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        showDesc.invoke(Person.class);

    }
    /*
    调用运行时类中的构造器
     */
    @Test
    public void testConstructor() throws Exception {

        Class clazz = Person.class;
        //private Person(String name)
        //1、获取指定的构造器
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);

        //2、保证此构造器是可访问的
        declaredConstructor.setAccessible(true);

        //3、调用此构造器创建运行时类的对象
        Person per = (Person) declaredConstructor.newInstance("Tom");
        System.out.println(per);
    }
}
