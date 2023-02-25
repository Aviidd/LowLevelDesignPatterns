package com.company.Director;

import com.company.Builders.HouseBuilder;
import com.company.Product.House;

public class CivilEngineer {
    //initializing a private variable of house builder
    private HouseBuilder houseBuilder;

    //calling a constructor of civil engineer
    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //calling a getter of house
    public House getHouse(){
        return this.houseBuilder.getHouse();
    }

    //constructing a concrete method.
    public void ConstructHouse(){
        this.houseBuilder.BuildBasement();
        this.houseBuilder.BuildStructure();
        this.houseBuilder.BuildRoof();
        this.houseBuilder.BuildInterior();
    }
}
