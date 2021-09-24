//@author Samuel Bailey 
package petClass;

public class Dog {
    private int dogSpaceNbr;
    private double dogWeight;
    private boolean grooming;
    
    public boolean getGrooming(){
        return grooming;
    }
    public double getDogWeight(){
        return dogWeight;
    }
    
    public void setGrooming(boolean groom){
        grooming = groom;
    }
    public void setDogWeight(double Weight){
        dogWeight = Weight;
    }
}
