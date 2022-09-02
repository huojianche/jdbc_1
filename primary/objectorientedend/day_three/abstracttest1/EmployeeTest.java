package primary.objectorientedend.day_three.abstracttest1;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("库克",38,5000,50000);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
