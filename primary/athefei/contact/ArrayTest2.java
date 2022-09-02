package primary.athefei.contact;

public class ArrayTest2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"AA","BB","CC","DD","EE"};
        String[] arr1 = new String[arr.length];
        System.out.print("arr1:");
        for(int i = 0;i < arr.length;i++){
            arr1[i] = arr[i];
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //数组反转
        System.out.print("arr2:");
        String[] arr2 = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[arr.length - i -1];
            System.out.print(arr2[i] + "\t");
        }

        System.out.println();
        //查找
        String dest = "BB";
        boolean isFind = true;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == dest){
                System.out.println("在第" + i + "位");
                isFind = false;
                break;
            }
        }
        if(isFind == true){
            System.out.println("没找到");
        }
        //二分法查找
        int first = 0;
        int[] arr3 = new int[]{1,2,3,4,5,6,7,8,9};
        int last = arr3.length;
        boolean Flag = true;
        int a = 6;

        while(first < last){
            int mid = (first + last) / 2;
            if(a == arr3[mid]){
                System.out.println("数组中存在，在第" + mid + "位");
                Flag = false;
                break;
            }
            if( a > arr3[mid]){
                first = mid + 1;
            }
            if (a < arr3[mid]){
                last = mid - 1;
            }
        }
        if(Flag){
            System.out.println("数组中没有a");
        }



    }
}
