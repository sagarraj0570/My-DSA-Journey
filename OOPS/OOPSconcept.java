package OOPS;

import java.util.*;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing color");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(){

    }

    student(student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class OOPSconcept {
    public static void main(String[] args){
//        Pen pen1 = new Pen();
//        pen1.color="blue";
//        pen1.type="gel";
//
//      pen1.write();
//
//        Pen p2 = new Pen();
//        p2.color = "black";
//        p2.type = "ball";
//
//        pen1.printColor();
//        p2.printColor();
        student s1 = new student();
        s1.name = "Ram";
        s1.age = 25;

        student s2 = new student(s1);
        s2.printInfo();
    }



}
