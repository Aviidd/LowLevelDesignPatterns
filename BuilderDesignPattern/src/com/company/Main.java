package com.company;

import com.company.Builders.HouseBuilder;
import com.company.Builders.IglooHouseBuilder;
import com.company.Builders.TreeHouseBuilder;
import com.company.Director.CivilEngineer;
import com.company.Product.House;

public class Main {

    public static void main(String[] args) {
        //build house type Igloo
        HouseBuilder IglooBuilder = new IglooHouseBuilder();
        //tell the director to construct the igloo house
        CivilEngineer engineer = new CivilEngineer(IglooBuilder);
        //engineer start constructing the house
        engineer.ConstructHouse();
        //house creation done, now fetching the house
        House house = engineer.getHouse();
        //printing the house
        System.out.println("Builder Constructed: " + house);

        //build house type tree
        HouseBuilder TreeBuilder = new TreeHouseBuilder();

        CivilEngineer engineer1 = new CivilEngineer(TreeBuilder);

        engineer1.ConstructHouse();

        House house1 = engineer1.getHouse();

        System.out.println("TreeHouse Constructed" + house1);

        //same as we can create multiple houses from civil engineer.
    }
}
