package ru.academits.Shapes.LV.Shapes;

import ru.academits.Shapes.LV.Interfaces.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getWidth() {
        return 2 * this.radius;
    }

    @Override
    public double getHeight() {
        return 2 * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object s){
        if(s == this){
            return true;
        }
        if(s == null || getClass() != s.getClass()){
            return false;
        }

        Circle circle = (Circle) s;

        return radius == circle.radius;
    }
}
