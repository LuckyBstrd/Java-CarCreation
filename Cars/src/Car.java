/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Luis Quintero
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;
    
    //f(x,y,z) = x + 1/z - y
    //Say x = 5
    //f(5) = 5 + 1 = 6
    
    public Car(){
        
    }
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }
    
    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public boolean isTheCarOn() {
        return this.isTheCarOn;
    }
    
    public char getCondition() {
        return this.condition;
    }
    
    public String getNameOfCar() {
        return this.nameOfCar;
    }
    
    public int getNumberOfPeopleInCar() {
        return this.numberOfPeopleInCar;
    }
 
    public void printVariables(){
        
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }
    
    public void updgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }
    
    public void getIn() {
        // numberOfPeopleInCar = numberOfPeopleInCar + 1
        // if tere aren't too many people in tha car
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar){
            //the someone can get in
            numberOfPeopleInCar ++;
            System.out.println("Someone got in");
        } else {
            // otherwise print out the fact the car is full
            System.out.println("The car is full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
        }
        
    }
    
    public void getOut() {
        // numberOfPeopleInCar = numberOfpeopleInCar - 1;
        // if there is someone in the car
        if (this.numberOfPeopleInCar > 0){
            //then someone can get out
            numberOfPeopleInCar --;
            System.out.println("Someone left the car");
        } else {
            // otherwise print the fact the car is empty
            System.out.println("No one is in the car");
        }
        
    }
    
    public double howManyMilesTillOutOfGas() {
        
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }
    
    public void turnTheCarOn(){
        //if the car isn't on ..
        if (!isTheCarOn){
            //turn it on
            isTheCarOn = true;
            System.out.println("The car turned on succesfully");
        } else {
            //oterwise print out the fact it's on
            System.out.println("The Car is already on " + isTheCarOn);
        }
        
    }
    
    public void turnTheCarOff(){
        //if the car isn't off ..
        if (isTheCarOn){
            //turn it off
            isTheCarOn = false; 
            System.out.println("The car turned off succesfully");
        } else {
            //oterwise print out the fact it's off
            System.out.println("The Car is already off " + isTheCarOn);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       Car tommyCar = new Car();
       tommyCar.getOut();
       tommyCar.getOut();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.getIn();
       tommyCar.turnTheCarOn();
       tommyCar.turnTheCarOn();
       tommyCar.turnTheCarOff();
       tommyCar.turnTheCarOff();
        
        
        
        //System.out.println("Christmas Car");
        //Car christmasPresent = new Car(120, 3000, false);
        //christmasPresent.printVariables();
    }
    
}
