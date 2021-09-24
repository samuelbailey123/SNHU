package petClass;
//@author samuelbailey

public class Pet {
    
    //declare variables to be used
    private String petType;
    private String petName;
    private int petAge;
    private boolean dogSpace;
    private boolean catSpace;
    private int daysStay;
    private double amountDue;
    
    /** here are the user defined methods (just some beginning testing errors) 
    public void petType(String newType){
        animalType = newType;
    }
    public void petName(String newName){
        animalName = newName;
    }
    public void petAge(double newAge){
        animalAge = newAge;
    }
    public void dogSpace(boolean dog){
        dogSpace = dog;
    }
    public void catSpace(boolean cat){
        catSpace = cat;
    }
    public void daysStay(double newStay){
        amountOfDaysStayed = newStay;
    }
    public void amountDue(double newAmountDue){
        totalDue = newAmountDue;
    }
    */
    
    //more methods / not defined in instructions therfore not used yet
    public void checkIn() {}
    public void checkOut() {}
    public void getPet() {}
    public void createPet() {}
    public void updatePet() {}

   //all of the set methods some call these methods mutators 
   public void setPetType(String type){
    petType = type;
   }
   public void setPetName(String name){
    petName = name;
   }
   public void setPetAge(int age){
    petAge = age;
   }
   public void setDogSpace(boolean dog){
    dogSpace = dog;
   }
   public void setCatSpace(boolean cat){
    catSpace = cat;
   }
   public void setDaysStay(int stay){
    daysStay = stay;
   }
   public void setAmountDue(double due){
    amountDue = due;
   }
   
   //here are some accessor methods 
   public String getPetType(){
    return petType;
   }
   public String getPetName(){
    return petName;
   }
   public int getPetAge(){
    return petAge;
   }
   public boolean getDogSpace(){
    return dogSpace;
   }
   public boolean getCatSpace(){
    return catSpace;
   }
   public int getDaysStay(){
    return daysStay;
   }
   public double getAmountDue(){
    return amountDue;
   }
   
   //default pet 
   public Pet(){
   petAge = 0;
   petName = "";
   petType = "";
   dogSpace = false;
   catSpace = false;
   amountDue = 0;
   daysStay = 0;
   }
   
   //main
    public static void main(String[] args) {
        
    }
    
}
