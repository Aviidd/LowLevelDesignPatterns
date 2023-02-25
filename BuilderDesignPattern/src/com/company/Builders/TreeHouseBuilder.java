package com.company.Builders;

import com.company.Product.House;

public class TreeHouseBuilder implements HouseBuilder{
    private House house;

    public TreeHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void BuildBasement() {
        house.setBasement("Basement created");
        System.out.println("Tree house basement ready");
    }

    @Override
    public void BuildStructure() {
        house.setStructure("structure is ready");
        System.out.println("Tree house structure ready");
    }

    @Override
    public void BuildRoof() {
        house.setRoof("roof is ready");
        System.out.println("Tree house roof ready");
    }

    @Override
    public void BuildInterior() {
        house.setInterior("interior is ready");
        System.out.println("Tree house interior ready");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
