package com.company.Builders;

import com.company.Product.House;

public class BrickHouseBuilder implements HouseBuilder{
    private House house;

    public BrickHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void BuildBasement() {
        house.setBasement("basement is ready");
        System.out.println("brick house basement ready");
    }

    @Override
    public void BuildStructure() {
        house.setStructure("structure is ready");
        System.out.println("brick house structure ready");
    }

    @Override
    public void BuildRoof() {
        house.setRoof("roof is ready");
        System.out.println("brick house roof ready");
    }

    @Override
    public void BuildInterior() {
        house.setInterior("interior is ready");
        System.out.println("brick house interior ready");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
