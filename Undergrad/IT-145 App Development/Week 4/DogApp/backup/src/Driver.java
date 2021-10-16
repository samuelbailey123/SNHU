//package com.company;
public class Driver {
    public static void main(String[] args) {
        //create an object of that class
        Dog myDog = new Corgi("Hunting Dog", "Black Mouth Curr", "Primrose", 86, 3);
        myDog.setTopTrick("Begging for food"); //set the TopTrick
        System.out.println(myDog.toString()); //print
    }
}