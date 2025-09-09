package com.rk.factory;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
    }
}
