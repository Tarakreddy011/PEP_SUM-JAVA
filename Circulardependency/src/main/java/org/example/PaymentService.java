package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {


//    @Autowired
    orderService orderService;
//    PaymentService paymentService;

//    public PaymentService(orderService orderService) {
//        this.orderService = orderService;
//    }

    public void  pay(){
        System.out.println("Payment done !!");
    }

//    public void setOrderService(orderService orderService) {
//        this.orderService = orderService;
//    }
}
