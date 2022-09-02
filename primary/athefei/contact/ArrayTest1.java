package primary.athefei.contact;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*
        Math.random() : [0.0 , 1.0]
        Math.random() * 90 : [0.0 , 90.0]
        (int)(Math.random() * 90) : [0 , 90]
        (int)(Math.random() * 90 +10) : [10 , 100]

        公式：获取[a , b]范围的随机数: (int)(Math.random() * (b - a + 1)) + a
         */
        int[] arr = new int[10];
        int max = 0;
        int min = 0;
        int sum = 0;

        System.out.print("这十个随机数是：" );
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        //最大值
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值是:" + max);
        //最小值
        min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("最小值是:" + min);
        //和值
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

        }
        System.out.println("和值是:" + sum);
        //平均值
        System.out.println("平均值是:" + sum / 10);
    }
}
