package primary.java.thirteen.equalsexer;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"AA");
        Order order2 = new Order(1002,"BB");
        Order order3 = new Order(1001,"AA");
        System.out.println(order1.equals(order2));
        System.out.println(order1.equals(order3));
    }

}
class Order{
    private int orderId;
    private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){return true;}
        if(o instanceof Order){
            Order order = (Order)o;
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Order order = (Order) o;
//        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }


}