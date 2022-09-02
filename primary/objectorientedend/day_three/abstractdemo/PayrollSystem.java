package primary.objectorientedend.day_three.abstractdemo;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前月份：");
        int month = scanner.nextInt();

        emps[0] = new SalariedEmployee("马森", 1001, new MyDate(1992, 1, 28), 100000);
        emps[1] = new HourlyEmployee("刘思", 2001, new MyDate(1991, 5, 6), 60, 240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();

            if (emps[i].getBirthday().getMonth() == month) {
                salary += 100;
                System.out.println("生日快乐！每月工资为：" + salary);
            }
            else{System.out.println("每月工资为：" + salary);}
        }
    }
}
