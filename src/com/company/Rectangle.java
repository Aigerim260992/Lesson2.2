package com.company;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }
    public double Perimetr(){
        return a*b;
    }

    @Override
    public String draw() {
        return "\uD83D\uDDBE";
    }
}
