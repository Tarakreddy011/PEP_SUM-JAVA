package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BakeryService {
    private PizzaMaker pizzaMaker;

    @Autowired
    public BakeryService() {
        this.pizzaMaker = pizzaMaker;
    }

    public void itemsinBakery(){
        System.out.println("items");
        pizzaMaker.makepizza();
    }
}
