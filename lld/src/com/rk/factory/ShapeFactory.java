package com.rk.factory;

public class ShapeFactory {

    public Shape getShape(String input) {

        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
