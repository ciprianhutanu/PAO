package org.example.lab3.animal;

public class Bird extends Animal{
    private String colour;

    public Bird(int noOfLegs, String name, String colour) {
        super(name, noOfLegs);
        this.colour = colour;
    }

    @Override
    public void move() {
        System.out.println("I can fly!");
    }

    public void sing(){
        System.out.println("CHIRP");
    }



}
