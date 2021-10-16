package com.company;

import java.text.SimpleDateFormat;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private String acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    }

    // Add Accessor Methods here
    public String getAnimalName(){
        return name;
    }
    public String getAnimalType(){
        return type;
    }
    public String getAnimalGender(){
        return gender;
    }
    public int getAnimalAge(){
        return age;
    }
    public float getAnimalWeight(){
        return weight;
    }
    public String getAnimalAcquisitionDate(){
        return acquisitionDate;
    }
    public SimpleDateFormat getAnimalStatusDate(){
        return statusDate;
    }
    public String getAnimalAcquisitionSource(){
        return acquisitionSource;
    }
    public boolean getReserved(){
        return reserved;
    }
    public String getTrainingLocation(){
        return trainingLocation;
    }


    // Add Mutator Methods here
    public void setAnimalName(String inputAnimalName){
        name = inputAnimalName;
    }
    public void setAnimalType(String inputAnimalType){
        type = inputAnimalType;
    }
    public void setAnimalGender(String inputAnimalGender){
        gender = inputAnimalGender;
    }
    public void setAnimalAge(int inputAnimalAge){
        age = inputAnimalAge;
    }
    public void setAnimalWeight(float inputAnimalWeight){
        weight = inputAnimalWeight;
    }
    public void setAnimalAcuisitionDate(String inputAnimalAcquisitionDate){
        acquisitionDate = inputAnimalAcquisitionDate;
    }
    public void setAnimalStatusDate(SimpleDateFormat inputAnimalStatusDate){
        statusDate = inputAnimalStatusDate;
    }
    public void setAnimalScquisitionSource(String inputAnimalAcquisitionSource){
        acquisitionSource = inputAnimalAcquisitionSource;
    }
    public void setAnimalReserved(boolean inputAnimalReserve){
        reserved = inputAnimalReserve;
    }
    public void setTrainingLocation(String trainingLocation){
        this.trainingLocation = trainingLocation;
    }

}

