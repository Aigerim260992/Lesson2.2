package com.company;

public class Dog extends Animal implements soundProducable{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return " \uD83D\uDC36";
    }

    @Override
    public void callSound() {
        System.out.println("Gav-Gav");
    }
}
