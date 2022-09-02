package myproject03.src.domain;

public class Designer extends Programmer{
    private double bonus;//奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public Designer(double bonus) {
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }



    @Override
    public String toString() {
        return getDetails() + "\t\t设计师\t" + getStatus() + "\t" + bonus + "\t\t\t\t" + getEquipment().getDescription();
    }
    public String getDetailsForTeam(){
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t设计师\t" + getBonus();
    }
}
