package reflect;

import org.junit.Test;

import java.util.Random;

/**
 * @author HF_Lee
 * @create 2022-08-06-14:17
 * 通过发射的创建对应的运行时类的对象
 *
 */
public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        /*
        newInstance():调用此方法，创建对应的运行时类的对象
         */
        Person obj = clazz.newInstance();
        System.out.println(obj);


    }
    @Test
    public void test2(){
        for(int i = 0;i < 100; i++){
            int num = new Random().nextInt(3);
            String classPath = "";
            switch(num){
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "reflect.Person";
                    break;
            }
            try {
                Object obj = getInstance(classPath);
                System.out.println(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /*
    创建一个指定类的对象
    classPath:指定类的全类名
     */
    public Object getInstance(String classPath) throws Exception {
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
}
