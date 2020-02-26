package spring.services;

public class Walmart implements Order {
    @Override
    public String orderItem() {
        return "Order Completed For Walmart Online";
    }
}
