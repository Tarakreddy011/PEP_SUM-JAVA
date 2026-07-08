package org.example;

public class Orderservice {
    public void placedOrder(){
        System.out.println("Order Placed");
        Emailservice emailservice = new Emailservice();
        emailservice.emailService();
        SMSNotification smsnotification = new SMSNotification();
        smsnotification.sendSMS();
    }
}
