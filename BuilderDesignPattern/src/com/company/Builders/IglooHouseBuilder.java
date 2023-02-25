package com.company.Builders;

import com.company.Product.House;

public class IglooHouseBuilder implements HouseBuilder{
    private House house; //data member of igloo house builder that is used to instialize a house.

    public IglooHouseBuilder(){
        //constructor of igloo house builder
        this.house = new House();
    }

    @Override
    public void BuildBasement() {
        System.out.println("Igloo house basement ready");
        house.setBasement("ice bars");
    }

    @Override
    public void BuildStructure() {
        // either we can use sout statement
        System.out.println("Igloo house structure ready");
        //or we can call the string
        house.setStructure("ice wall");
    }

    @Override
    public void BuildRoof() {
        System.out.println("Igloo house basement ready");
        house.setRoof("ice blocks");
    }

    @Override
    public void BuildInterior() {
        System.out.println("Igloo house interior ready");
        house.setInterior("ice bag");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
