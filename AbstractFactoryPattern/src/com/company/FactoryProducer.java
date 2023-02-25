package com.company;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class FactoryProducer {
    @Contract("_ -> new")
    public static @NotNull AbstractFactory getFactory(@NotNull String rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
