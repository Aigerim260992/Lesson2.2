package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        circle.Perimetr();
        //System.out.println(circle.getName() + circle.Perimetr());
        Square square = new Square("Square", 9);
        square.Perimetr();
        //System.out.println(square.getName() + square.Perimetr());

        Figure[] figures = {circle, square, new Triangle("Треугольник", 1, 2, 3),
                new Rectangle("Прямоугольник", 4, 5)};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getName() + " " + figures[i].draw() + " " + figures[i].Perimetr());
        }

        Dog dog = new Dog("Effa");
        System.out.println(dog.name + dog.draw());
        dog.callSound();
    }

}

