package com.company;

public class PayPal implements PaymentStrategy{
    public String email;

    public PayPal(String email){
        this.email = email;
    }

    @Override
    public void pay(int price) {
        System.out.println("Paypal : $" + price);
    }
}
