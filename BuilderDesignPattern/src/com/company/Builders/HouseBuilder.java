package com.company.Builders;

import com.company.Product.House;

public interface HouseBuilder {
    public void BuildBasement();
    public void BuildStructure();
    public void BuildRoof();
    public void BuildInterior();

    //calling a getter of house
    public House getHouse();
}
