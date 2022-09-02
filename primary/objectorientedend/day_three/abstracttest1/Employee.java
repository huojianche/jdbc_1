package primary.objectorientedend.day_three.abstracttest1;

public abstract class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public abstract void work();
}
