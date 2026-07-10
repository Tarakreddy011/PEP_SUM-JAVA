package org.example;


import org.springframework.stereotype.Component;

@Component
public class PizzaMaker {

    public PizzaMaker() {
        this.makepizza();
    }
    public void makepizza() {
        System.out.println("PizzaMaker makes a pizza!");
    }
}
