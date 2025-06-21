package OOPS;

import java.util.*;
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("create new animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Created");
    }

    public void walk(){
        System.out.println("on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("on 2 legs");

    }
}

public class Abstraction {
    public static void main(String[] args){
        Horse h1 = new Horse();


    }

}
