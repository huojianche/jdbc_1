package primary.athefei.java;

public class Recursion {
    public static void main(String[] args) {
        //斐波那契数列
        Recursion a = new Recursion();
        int b = a.feibo(7);
        System.out.println(b);
    }
    public  int feibo(int n){
        int sum = 0;
        if(n == 1){
            return sum = 1;
        }else if(n == 2){
            return sum = feibo(1) + sum;
        }else{
            return sum = feibo(n - 2) + feibo(n - 1);
        }

    }
}

