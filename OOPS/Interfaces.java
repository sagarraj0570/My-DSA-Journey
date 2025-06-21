package OOPS;

import java.util.*;

interface Animals {
    int eyes = 2;
    void walk();
}
interface Carnivore{

}

class Tiger implements Animals,Carnivore{
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

}
public class Interfaces {
    public static void main(String[] args){
        Tiger tiger = new Tiger();
        tiger.walk();
        
    }
}
