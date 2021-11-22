package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> shoppingCart;
    private int total;

    public ShoppingCart(){
        shoppingCart = new ArrayList<>();
    }

    public void addItem(Item item){
        shoppingCart.add(item);
    }

    public void removeItem(Item item){
        shoppingCart.remove(item);
    }

    public int calculateTotal(){
        total = 0;
        for(Item item: shoppingCart){
            total += item.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }
}
