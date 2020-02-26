package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.Snack;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Snack aSnack = context.getBean("mySnack", Snack.class);

        System.out.println("Service: "+aSnack.getReceipt());
        System.out.println("Snack_ID: " + aSnack.getSnack_id());
        System.out.println("Snack_Name: " + aSnack.getSnack_name());
        System.out.println("Tier_ID: " + aSnack.getTier());
        System.out.println("Type_ID: " + aSnack.getType_id());

        context.close();
    }
}
