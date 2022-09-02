package myproject03.src.domain;

public class Architect extends Designer{
    private int stock;//股票

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t\t架构师\t" + getStatus() + "\t" + getBonus() +"\t\t" + stock + "\t" + getEquipment().getDescription();
    }
    public String getDetailsForTeam(){
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t架构师\t" + getBonus() + "\t" +getStock();
    }
}
