package ru.academits.Shapes.LV.Shapes;

import ru.academits.Shapes.LV.Interfaces.Shape;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public boolean equals(Object s){
        if(s == this){
            return true;
        }
        if(s == null || getClass() != s.getClass()){
            return false;
        }

        Square square = (Square) s;

        return side == square.side;
    }
}
