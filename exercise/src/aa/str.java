package aa;

import org.junit.Test;

/**
 * @author HF_Lee
 * @create 2022-08-11-23:08
 */
public class str {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        str s = new str();
        s.rotate(arr,2);
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    public void rotate(int[] nums, int k) {
        int m = nums.length - k;
        k = k % nums.length;
        int[] arr = new int[k];
        int[] arr1 = new int[nums.length - k];

        for(int i = 0;i < nums.length - k;i++){
            arr1[i] = nums[i];
        }
        for(int i = 0 ; i < k;i++){
            arr[i] = nums[m++];
        }
        for(int i = 0;i < nums.length ;i++){
            if(i < k){
                nums[i] = arr[i];
            }else if(i >= k){
                nums[i] = arr1[i - k];
            }
        }
    }
    @Test
    public void test1(){

        int[] arr = new int[]{0,2,0,0,2,3,0};
        moveZeroes(arr);
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public void moveZeroes(int[] nums) {
        for(int i = 0;i < nums.length;i++){

            if(nums[i] == 0 && i != (nums.length - 1) ){
                for(int j = i;j < nums.length - 1;j++){
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
            }
        }
    }
    @Test
    public void test2(){

        String s = "abc sad  afafa f afs";
        String[] str = s.split(" ");
        for(int i = 0;i < str.length;i++){
            System.out.println(str[i]);
        }
    }
    @Test
    public void test3(){

//        String s = "asd asds fad";
//        char[] chars = s.toCharArray();
//        for(int i = 0;i < chars.length;i++){
//            System.out.println(chars[i]);
//        }
        String a = "Let's take LeetCode contest";
        String[] words = a.split(" ");
        System.out.println(words);

        for (int i = 0; i <words.length; i++) {
            String b = "";
            for (int j = words[i].length()-1; j >0; j--) {
                b+=words[i].charAt(j);
            }
            System.out.println(b);
            words[i] = b;
        }
        System.out.println( String.join(" ",words));



    }
    @Test
    public void test4(String s){
        String[] str = s.split(" ");

        for(int i = 0;i < str.length;i++){
            String a = "";
            for(int j = str[i].length() - 1;j >= 0;j--){
                a += str[i].charAt(j);
            }
            str[i] = a;
        }
        String str1 = String.join(" ",str);


    }



}
