package OOPS;

import java.util.*;
class Shape{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);

    }

}


public class Inheritance {
    public static void main(String[] args){
        Triangle t1 = new Triangle();


    }
}
