package com.company;

public class CreditCard implements PaymentStrategy{
    public String cardNumber;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int price) {
        System.out.println("CreditCard : $" + price);
    }
}
