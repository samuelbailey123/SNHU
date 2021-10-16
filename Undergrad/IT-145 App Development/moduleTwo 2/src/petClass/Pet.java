package petClass;
//@author samuelbailey
import java.util.Scanner;
import java.util.List;
public class Pet {
    
    //declare variables to be used
    private String petType;
    private String petName;
    private int petAge;
    private boolean dogSpace;
    private boolean catSpace;
    private int daysStay;
    private double amountDue;
    private int catSpaceCounter = 0;
    private int dogSpaceCounter = 0;
    private double dogWeight;
    private boolean grooming;
    private List catSpaceRoom; 
    private List dogSpaceRoom;
    
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
    
    //more metshods / not defined in instructions therfore not used yet
    public void checkIn() {
    Scanner input = new Scanner(System.in);
    System.out.println("cat or dog?");
    petType = input.nextLine();
    if (petType == "cat"){
        if (catSpaceCounter <= 12 ){
            catSpaceCounter +=1; 
            catSpaceRoom.add(catSpaceCounter);
        }else if (catSpaceCounter > 12){
            System.out.println("STORAGE FULL");
        }
    }else if (petType == "dog"){
        if (dogSpaceCounter <= 30){
            dogSpaceCounter += 1;
            dogSpaceRoom.add(dogSpaceCounter);
        }else if (dogSpaceCounter > 30){
            System.out.println("STORAGE FULL");
        }
    }
    System.out.println("Has the pet ever stayed here before?(Yes or No");
    String newOrReturning = input.nextLine();
    if (newOrReturning == "No"){
        System.out.println("Allow us to get some information.");
        System.out.println("What is the name of the pet?");
        petName = input.nextLine();
        System.out.println("What is the age of the pet?");
        petAge = input.nextInt();
        System.out.println("How many nights are you staying?");
        daysStay = input.nextInt();
        if (petType == "dog"){
            System.out.println("Would you like grooming? (Y or N)");
            String check = input.nextLine();
            if (check == "Y"){
                grooming = true;
            }else{
                grooming = false;
            }System.out.println("What is the weight of the dog?");
            dogWeight = input.nextDouble();
        }
        System.out.println("Thank you for the information.");
    }
    if (newOrReturning == "Yes"){
        System.out.println("Would you like to update your information?");
        String checkTwo = input.nextLine();
        if (checkTwo == "Yes"){
            System.out.println("What is the name of the pet?");
        petName = input.nextLine();
        System.out.println("What is the age of the pet?");
        petAge = input.nextInt();
        System.out.println("How many nights are you staying?");
        daysStay = input.nextInt();
        if (petType == "dog" && daysStay > 2){
            System.out.println("Would you like grooming? (Y or N)");
            String check = input.nextLine();
            if (check == "Y"){
                grooming = true;
            }else{
                grooming = false;
            }System.out.println("What is the weight of the dog?");
            dogWeight = input.nextDouble();
        }
    }else {
            System.out.println("Thank you.");
        }
    }  
    
    }
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
