package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    static void main() {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        orderService orderService = (orderService) context.getBean("orderService");
//
//        orderService.placeOrder();

        BakeryService bakeryService = new BakeryService();

        bakeryService.itemsinBakery();
    }
}
