package com.company;

public class RoundedShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RoundedRectangle")){
            return new RoundedRectangle();
        }
        else if(shapeType.equalsIgnoreCase("RoundedSquare")){
            return new RoundedSquare();
        }
        return null;
    }
}
