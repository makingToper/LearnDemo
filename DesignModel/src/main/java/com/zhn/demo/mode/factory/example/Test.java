package com.zhn.demo.mode.factory.example;

public class Test {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        store.order("apple");
        store.order("banana");
    }
}
