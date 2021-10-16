package com.company;

public class Monkey extends RescueAnimal {

    //variables
    public String monkeyBreed;
    public String monkeyGender;
    public double monkeyWeight;
    public int monkeyAge;
    public String monkeyDate;
    public String monkeyLocation;
    public double monkeyLength;
    public double monkeyHeight;
    public int monkeyBodyLength;
    public String monkeySpecies;
    public double monkeyTorso;
    public double monkeySkull;
    public double monkeyNeck;

    //default constructor
    public Monkey(){
    }

    //accessors
    public String getMonkeyBreed(){
        return monkeyBreed;
    }
    public double getMonkeyLength(){
        return monkeyLength;
    }
    public double getMonkeyHeight(){
        return monkeyHeight;
    }
    public int getMonkeyBodyLength(){
        return monkeyBodyLength;
    }
    public String getMonkeySpecies(){
        return monkeySpecies;
    }
    public double getMonkeyTorso(){
        return monkeyTorso;
    }
    public double getMonkeySkull(){
        return monkeySkull;
    }
    public double getMonkeyNeck(){
        return monkeyNeck;
    }

    //mutators
    public void setBreed(String inputMonkeyBreed) {
        monkeyBreed = inputMonkeyBreed;
    }
    public void setMonkeyLength(double inputMonkeyLength){
        monkeyLength = inputMonkeyLength;
    }
    public void setMonkeyHeight(double inputmonkeyHeight){
        monkeyHeight = inputmonkeyHeight;
    }
    public void setMonkeyBodyLength(int inputMonkeyBodyLength){
        monkeyBodyLength = inputMonkeyBodyLength;
    }
    public void setMonkeySpecies(String inputMonkeySpecies){
        monkeySpecies = inputMonkeySpecies;
    }
    public void setMonkeyTorso(double inputMonkeyTorso){
        monkeyTorso = inputMonkeyTorso;
    }
    public void setMonkeySkull(double inputMonkeySkull){
        monkeySkull = inputMonkeySkull;
    }
    public void setMonkeyNeck(double inputMonkeyNeck){
        monkeyNeck = inputMonkeyNeck;
    }
}
