package reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author HF_Lee
 * @create 2022-08-05-12:11
 */
public class ReflectionTest {

    //反射前对person类的操作
    @Test
    public void test(){

        //1.创建person类的对象
        Person p1 = new Person("Tom",12);

        //2.通过对象，调用内部的属性和方法
        p1.age = 22;
        System.out.println(p1);

        p1.show();
        //在person类外，不可以通过Person类的对象去调用内部的私有结构
    }
    //反射后，对于person的操作
    @Test
    public void test2() throws Exception{

        Class<Person> clazz = Person.class;
        //1.通过反射，创建Person类的对象
        Constructor<Person> cons = clazz.getConstructor(String.class, int.class);

        Person p = cons.newInstance("Tom", 12);
        System.out.println(p);
        //2.通过反射。调用person类的属性和方法
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p);

        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        //通过反射，可以调用person类的私有结构，比如：私有的构造器，方法，属性
        Constructor<Person> cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = cons1.newInstance("Jerry");
        System.out.println(p1);

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"liming");
        System.out.println(p1);

        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        showNation.invoke(p1,"中国");
    }

    /*
    class实例化方式
     */
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一:调用运行时类的属性: .class
        Class clazz1 = Person.class;
        System.out.println(clazz1);
        //方式二:通过运行时类的对象
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);
        //方式三:用class类的静态方法:forName(String classPath)
        Class<?> clazz3 = Class.forName("reflect.Person");
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
        //方式四:类的加载器:classLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("reflect.Person");
        System.out.println(clazz4);
        System.out.println(clazz1 == clazz4);
    }
}
