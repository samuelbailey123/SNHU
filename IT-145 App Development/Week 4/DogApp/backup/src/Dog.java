//package com.company;
public class Dog {

    // instance variables
    public String type = " ";
    public String breed = " ";
    public String name = " ";
    public String topTrick = " ";

    // constructor
    public Dog(){
        String type = " ";
        String breed = " ";
        String name = " ";
        String topTrick = " ";
    }
    public Dog(String newType, String newBreed, String newName){
        type = newType;
        breed = newBreed;
        name = newName;
    }


    // methods
    public void setTopTrick(String newTopTrick){
        topTrick = newTopTrick;
    }

    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }

}
