package generic;

/*
 * @author HF_Lee
 * @create 2022-07-30-16:09
 *
 * 自定义泛型类
 */
public class Order<T> {
    String name;
    int OrderId;

    //类的内部结构就可以使用类的泛型
    T orderT;
    public Order(){};

    public Order(String name, int orderId, T orderT) {
        this.name = name;
        OrderId = orderId;
        this.orderT = orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", OrderId=" + OrderId +
                ", orderT=" + orderT +
                '}';
    }
}
