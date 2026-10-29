public class Factory {

    public String owner = "Reed";
   //instance variables
    public boolean isOpen = true;
    public int yearfounded = 2026;
    public Donuts donutOrder1;

    //todo: make a new donut called donutsOrder2
    //only do the monopoly box creation dont use constructor
    public Donuts donutOrder2;
    //class -> blueprint
    //object -> is the house
    public int randomNumber;

    public static void main(String[] args) {
        Factory a = new Factory();
    }

    //special method: constructor
    // name of constructor has to be same name as the class
    // do not say void
    public Factory(){

        System.out.println("Welcome to Reed's factory");
        System.out.println("the factory was made in ");
        System.out.println(yearfounded);
        System.out.println("system is " + isOpen + " that the factory is open");

        randomNumber = (int)(Math.random() * 100) + 1;
        //make an object of type donuts
        donutOrder1 = new Donuts(randomNumber);
        System.out.println(donutOrder1.numberOfDonuts + " donuts please");
        System.out.println("all " + donutOrder1.frostingType);
        System.out.println("it is " + donutOrder1.hasfilling + " that I want filling");
        donutOrder1.numberOfDonuts = donutOrder1.numberOfDonuts + 1;
        System.out.println(donutOrder1.numberOfDonuts + " donuts please");

        randomNumber = (int)(Math.random() * 45) + 1;
        //todo: make the 2nd order have a range of 1-45 using random
        donutOrder2 = new Donuts(randomNumber);
        //todo: sout the donutsOrder2 instance vars
        System.out.println(donutOrder2.numberOfDonuts + " donuts please");
        System.out.println("all " + donutOrder2.frostingType);
        System.out.println("it is " + donutOrder2.hasfilling + " that I want filling");
        donutOrder2.numberOfDonuts = donutOrder1.numberOfDonuts * 2;
        System.out.println(donutOrder2.numberOfDonuts + " donuts please");

        donutOrder2.printInfo();

    }

}