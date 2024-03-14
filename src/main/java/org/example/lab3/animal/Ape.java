package org.example.lab3.animal;

public class Ape extends Animal{
    private String size;

    public Ape(String name, int noOfLegs, String size) {
        super(name, noOfLegs);//calls parent constructor / must stay on the first line
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("I want bananas!!");
    }
}
