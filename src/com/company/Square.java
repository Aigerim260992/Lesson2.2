package com.company;

public class Square extends Figure{
    int sideA;

    public int getSideA() {
        return sideA;
    }

    public Square(String name, int a) {
        super(name);
        this.sideA = a;
    }

    public double Perimetr(){
        return 4*sideA;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD32";
    }
}
