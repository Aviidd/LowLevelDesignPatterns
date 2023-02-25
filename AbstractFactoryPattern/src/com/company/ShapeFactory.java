package com.company;

import org.jetbrains.annotations.Nullable;

public class ShapeFactory extends AbstractFactory{
    @Override
    public static @Nullable Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
