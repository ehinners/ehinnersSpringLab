package spring.services;

public class Amazon implements Order {
    @Override
    public String orderItem() {
        return "Ordered From Amazon";
    }
}
