package reflect.java;

import java.io.Serializable;

/**
 * @author HF_Lee
 * @create 2022-08-08-10:35
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }
    private void eat(){
        System.out.println("生物吃东西");
    }
}
