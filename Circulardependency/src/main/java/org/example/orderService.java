package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("Prototype")
@Component
public class orderService {
    private PaymentService paymentService;

    public orderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order placed");
    }

}
