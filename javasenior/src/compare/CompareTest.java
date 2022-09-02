package compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author HF_Lee
 * @create 2022-07-14-17:14
 */
public class CompareTest {

    @Test
    public void test1(){
        String[] arr = new String[]{"AA","BB","CC","DD","EE","FF"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("联想",5000);
        arr[1] = new Goods("华为",6000);
        arr[2] = new Goods("苹果",5500);
        arr[3] = new Goods("小米",4545);
        arr[4] = new Goods("oppo",6345);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    @Test
    public void test3(){
        String[] arr = new String[]{"AA","BB","CC","DD","EE","FF"};
        Arrays.sort(arr,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String str1 = (String)o1;
                    String str2 = (String)o2;
                    return -str1.compareTo(str2);
                }
                throw new RuntimeException("输入的数据类型不一致");
            }

        });
        System.out.println(Arrays.toString(arr));
    }
}
