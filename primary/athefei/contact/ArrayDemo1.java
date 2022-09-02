package primary.athefei.contact;
import java.util.Scanner;


public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生个数：");
        int num = scan.nextInt();
        int[] student = new int[num];

        for(int i = 1; i <= student.length; i++){
            System.out.println("请输入第" + i + "位学生的成绩：");
            student[i-1] = scan.nextInt();
        }
        int max = 0;
        for (int j = 0; j < student.length;j++){
            if(student[j] >= max){
                max = student[j];
            }
        }
        System.out.println("最高分是：" + max);
    }
}
