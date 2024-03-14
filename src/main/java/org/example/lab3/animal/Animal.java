package org.example.lab3.animal;

import java.util.Objects;

public class Animal {
    private String name;
    private int noOfLegs;

    public Animal() {
    }

    public Animal(String name, int noOfLegs) {
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getName() {
        return name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void move(){
        System.out.println("I can move");
    }
    public void eat(){
        System.out.println("I need something to eat");
    }
    public void eat(String food){
        System.out.println("I eat " + food);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        return noOfLegs == animal.noOfLegs && Objects.equals(name, animal.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, noOfLegs);
//    }
}

