package com.zhn.demo.mode.factory.example;

public class PizzaStore {

    private PizzaOrder pizzaOrder;

    public PizzaStore() {
        pizzaOrder = new PizzaOrder();
    }

    public void order(String pizzaName){
        this.pizzaOrder.makeit(pizzaName);
    }

}
