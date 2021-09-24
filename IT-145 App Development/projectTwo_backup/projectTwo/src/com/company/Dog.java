package com.company;

public class Dog extends RescueAnimal {

    // Instance variable
    public String dogBreed;
    public String dogGender;
    public double dogWeight;
    public int dogAge;
    public String dogDate;
    public String dogLocation;
    public boolean reserved;
    // defualt Constructor
    public Dog() {
    dogBreed = " ";
    dogGender = " ";
    dogWeight = 0.0;
    dogAge = 0;
    dogDate = " ";
    dogLocation = " ";
    }

    //main constructor
    public Dog(String inputDogBreed, String inputDogGender, double inputDogWeight, int inputDogAge, String inputDogDate, String inputDogLocation){
        dogBreed = inputDogBreed;
        dogGender = inputDogGender;
        dogWeight = inputDogWeight;
        dogAge = inputDogAge;
        dogDate = inputDogDate;
        dogLocation = inputDogLocation;
    }

    // Accessor Method
    public String getDogBreed() {
        return dogBreed;
    }
    public String getDogGender(){
        return dogGender;
    }
    public double getDogWeight(){
        return dogWeight;
    }
    public int getDogAge(){
        return dogAge;
    }
    public String getDogDate(){
        return dogDate;
    }
    public String getDogLocation(){
        return dogLocation;
    }
    public boolean getReserved(){
        return reserved;
    }


    // Mutator Method
    public void setBreed(String inputdogBreed) {
        dogBreed = inputdogBreed;
    }
    public void setDogGender(String dogGender){
        this.dogGender = dogGender;
    }
    public void setDogWeight(double dogWeight){
        this.dogWeight = dogWeight;
    }
    public void setDogAge(int dogAge){
        this.dogAge = dogAge;
    }
    public void setDogDate(String dogDate){
        this.dogDate = dogDate;
    }
    public void setAnimalReserved(boolean inputAnimalReserve){
        reserved = inputAnimalReserve;
    }
    public void setDogLocation(String dogLocation){
        this.dogLocation = dogLocation;
    }


}
