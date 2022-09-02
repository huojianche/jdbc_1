package primary.java.nine.account;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank(){
        customers = new Customer[10];
    }
    //添加客户
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
        customers[numberOfCustomers] = cust;
        numberOfCustomers++;
    }
    //获取客户数量
    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomer(int index){
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];
        }else{
            return null;
        }
    }
}
