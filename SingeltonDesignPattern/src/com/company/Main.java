package com.company;

public class Main {

    public static void main(String[] args) {
        //creating one object
	    Singleton singleton = Singleton.getInstance();
        singleton.SayHello();

        //creating second object
        Singleton singleton1 = Singleton.getInstance();
        singleton1.SayHello();

    }
}
