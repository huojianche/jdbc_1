package primary.athefei.java;

public class Order {
    private int orderPrivate;
    int OrderDefault;
    public int orderPublic;


    private void methodPrivate(){
        orderPrivate = 1;
        OrderDefault = 2;
        orderPublic = 3;

    }
    void methodDefault(){
        orderPrivate = 1;
        OrderDefault = 2;
        orderPublic = 3;
    }
    public void methodPublic(){
        orderPrivate = 1;
        OrderDefault = 2;
        orderPublic = 3;
    }
}
