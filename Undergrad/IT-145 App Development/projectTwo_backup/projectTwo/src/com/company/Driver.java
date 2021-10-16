//@author Samuel Bailey

package com.company;
import java.util.Scanner;
import java.lang.String;

public class Driver {

    public static void main(String[] args) {

        //input keyboard
        Scanner keyboard = new Scanner(System.in);
/*
I did not use any of these variables.
        // Instance variables
        String type;
        String gender;
        int age;
        float weight;
        String aquisitionDate;
        String aquisitionSource;
        String reserved;
        String trainingLocation;
        String trainingStart;
        String trainingEnd;
        String trainingStatus;
        String name;

 */

        // Create New Dog
        Dog sam = new Dog();

        // Create New Monkey
        Monkey prim = new Monkey();

        // Method to process request for a rescue animal
        /*
        Not the Method I choose.
        System.out.println("What type of animal do you want?");
        type = keyboard.nextLine();
        System.out.println("What country do you reside in?");
        trainingLocation = keyboard.nextLine();

         */

        // Method(s) to update information on existing animals
        //System.out.println("What would you like to update?");



        // Method to display matrix of aninmals based on location and status/training phase


        // Method to add animals
        System.out.println("Add Animal");
        System.out.println("Is the animal a dog or monkey?");
        String inputForPrintStatementAbove = keyboard.nextLine();
        if (inputForPrintStatementAbove.equals("dog")){
            Dog newName = new Dog();
            System.out.println("What is the breed of this dog?");
            String inputForDogBreed = keyboard.nextLine();
            if(inputForDogBreed.equals("American pit bull terrier") || inputForDogBreed.equals("Beagle")|| inputForDogBreed.equals("Belgian Malinois")|| inputForDogBreed.equals("Border collie")|| inputForDogBreed.equals("Bloodhound")|| inputForDogBreed.equals("Coonhound")|| inputForDogBreed.equals("English springer spaniel")|| inputForDogBreed.equals("German shepherd")|| inputForDogBreed.equals("German shorthaired pointer")|| inputForDogBreed.equals("Golden retriever")|| inputForDogBreed.equals("Labrador retriever")|| inputForDogBreed.equals("Nova Scotia duck tolling retriever")|| inputForDogBreed.equals("Rough collie")|| inputForDogBreed.equals("Smooth collie")){
                newName.setBreed(inputForDogBreed);
                System.out.println("What is the gender of this dog?");
                String localGender = keyboard.nextLine();
                newName.setDogGender(localGender);
                System.out.println("What is the age of this dog?");
                int localDogAge = keyboard.nextInt();
                newName.setDogAge(localDogAge);
                System.out.println("What is the weight of this dog?");
                newName.setDogWeight(keyboard.nextDouble());
                System.out.println("What is the date for this dog?");
                newName.setDogDate(keyboard.nextLine());
                System.out.println("What is the location that this dog was obtained?");
                newName.setDogLocation(keyboard.nextLine());
                System.out.println("Thank you for the information.");
            }else{
                System.out.println("We do not accept this breed input");
            }
        }else if (inputForPrintStatementAbove.equals("monkey")){
            Monkey newName = new Monkey();
            System.out.println("Wht is the breed of this monkey?");
            String inputForMonkeyBreed = keyboard.nextLine();
            if (inputForMonkeyBreed.equals("Capuchin")|| inputForMonkeyBreed.equals("Guenon")|| inputForMonkeyBreed.equals("Macaque")|| inputForMonkeyBreed.equals("Marmoset")|| inputForMonkeyBreed.equals("Squirrell monkey")||inputForMonkeyBreed.equals("Tamarin")){
                newName.setBreed(inputForMonkeyBreed);
                System.out.println("What is the gender of this monkey?");
                newName.setAnimalGender(keyboard.nextLine());
                System.out.println("What is the age of this monkey?");
                newName.setAnimalAge(keyboard.nextInt());
                System.out.println("What is the weight of this monkey?");
                newName.setAnimalWeight(keyboard.nextFloat());
                System.out.println("What is the date for this monkey?");
                newName.setAnimalAcuisitionDate(keyboard.next());
                System.out.println("What is the location that this dog was obtainted");
                newName.setTrainingLocation(keyboard.nextLine());
                System.out.println("What is the tail length for this monkey?");
                newName.setMonkeyLength(keyboard.nextInt());
                System.out.println("What is the height of this monkey?");
                newName.setMonkeyHeight(keyboard.nextInt());
                System.out.println("What is the body length of this monkey?");
                newName.setMonkeyBodyLength(keyboard.nextInt());
                System.out.println("What is the measurements for this monkeys torso?");
                newName.setMonkeyTorso(keyboard.nextDouble());
                System.out.println("What is the measurments for this monkeys skull?");
                newName.setMonkeySkull(keyboard.nextDouble());
                System.out.println("What is the measurements for this monkeys neck?");
                newName.setMonkeyNeck(keyboard.nextDouble());
                System.out.println("Thank you for the information.");


            }else{
                System.out.println("We do not accept this breed of monkey at this current time.");
            }
        }else{
            System.out.println("Invalid input");
        }



        /*/
        Not the method I choose.
        / Method to out process animals for the farm or in-service placement
        System.out.println("Farm or Service?");
        String placementVariable = keyboard.nextLine();
        if (placementVariable == "Farm"){
            trainingStatus = "Farm";
        }else if (placementVariable == "Service"){
            trainingStatus = "Service";
        }
        */


        /*
        Not the Method I choose.
        // Method to display in-service animals
        if (sam.getReserved()==true){
            System.out.println("sam is in service");
        }else{
            System.out.println("sam is not in service");
        }
        if (prim.getReserved()==true){
            System.out.println("prim is in service");
        }else{
            System.out.println("prim is not in service");
        }

         */

        /*
        Not the method I choose.
        // Process reports from in-service agencies reporting death/retirement
        System.out.println("What is the name of the animal who passed away?");
        String deathAnimal = keyboard.nextLine();

         */



    }

}
