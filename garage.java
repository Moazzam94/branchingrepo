package com.company;

public class garage {
    public static void main(String[]args){
        car car1=new car();
        car1.numberofDoors=4;

        car1.color="black";
        car1.make="BMW";
        car1.model="i8";
        car1.size=4;
        car1.LCD="Yes";
        car1.transmission="Manual";
 
        System.out.println(car1.numberofDoors);
        System.out.println(car1.color);
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.size);
        System.out.println(car1.transmission);
        System.out.println(car1.LCD);
    }
}
