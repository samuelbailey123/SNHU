public class Dog {

    // instance variables


    // constructor
    public Dog(){
        public String type = " ";
        public String breed = " ";
        public String name = " ";
        public String topTrick = " ";
    }
    public Dog(String newType, String newBreed, String newName){
        this.type = newType;
        this.breed = newBreed;
        this.name = newName;
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
