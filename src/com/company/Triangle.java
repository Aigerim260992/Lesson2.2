package com.company;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double Perimetr(){
        return sideA + sideB + sideC;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD3A ";
    }
}
