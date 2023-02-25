package com.company;

public class Main {

    public static void main(String[] args) {
	    AbstractFactory shapeFactory = FactoryProducer.getFactory("False");

        Shape shape1 = ShapeFactory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("Square");
        shape2.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory("true");
        Shape shape3 = ShapeFactory.getShape("RoundedRectangle");
        shape3.draw();

        Shape shape4 = ShapeFactory.getShape("RoundedSquare");
        shape4.draw();
    }
}
