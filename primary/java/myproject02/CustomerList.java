package primary.java.myproject02;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     * 用来初始化customer数组
     * @param totalCustomer：指定数组的长度
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * 将指定客户添加到数组中
     * @param customer
     * @return true：添加成功 false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * 修改置定位是上的客户信息
     * @param index
     * @param cust
     * @return true：修改成功 false：修改失败
     */
    public boolean replaceCustomer(int index,Customer cust){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定位置上的客户
     * @param index
     * @return true：删除成功 false：删除失败
     */
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
        for(int i = index;i < total - 1;i++){
            customers[index] = customers[index + 1];
        }
        customers[total - 1] = null;
        total--;
        return true;
    }

    /**
     * 获取所有用户的信息
     * @return
     */
    public Customer[] getAllCustomer(){
        Customer[] custs = new Customer[total];
        for(int i = 0;i < total;i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定位置上的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储客户的数量
     * @return
     */
    public int getTotal(){
        return total;
    }

}
