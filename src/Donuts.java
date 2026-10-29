public class Donuts {
    //class blueprints for the things we want to make

    //instance variables
    //todo: make the three comments into variables
    //frosting type
    public String frostingType;
    //is there a filling
    public boolean hasfilling;
    //how many donuts
    public int numberOfDonuts;

    //constructor
        //method- special
        //dont say void
        //has to match exactly name of class

    public Donuts(int pNumberOfDonuts){
        frostingType = "boston creme";
        hasfilling = true;
        numberOfDonuts = pNumberOfDonuts;
    }//end constructor
    //todo: make a method called printinfo

    public void printInfo(){
    //todo: use souts to print the instance variables
        System.out.println("the type of creme is " + frostingType);
        System.out.println("its " + hasfilling + " that the donut has filling");
        System.out.println(numberOfDonuts + " donuts");
    }


}
