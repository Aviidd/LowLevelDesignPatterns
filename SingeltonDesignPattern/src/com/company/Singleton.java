package com.company;

public class Singleton {
    private static Singleton instance; //static variable

    private Singleton(){
        //we make the constructor private so that no other person can initialize the object
    }

    public static Singleton getInstance(){
        // a getter which is used to call the object from the singleton constructor.
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    // in this only above 3 steps are mandatory, below the concrete method is not mandatory.

    public void SayHello(){
        // a concrete method
        System.out.println("Hi i am Singleton Method");
        System.out.println(instance);
    }
}
