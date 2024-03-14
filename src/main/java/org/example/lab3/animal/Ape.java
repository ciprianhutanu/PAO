package org.example.lab3.animal;

import java.util.Objects;

public class Ape extends Animal{
    private String size;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Ape ape = (Ape) o;
//        return Objects.equals(size, ape.size);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(size);
//    }

    public Ape(int noOfLegs, String name, String size) {
        super(name, noOfLegs);//calls parent constructor / must stay on the first line
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println("I want bananas!!");
    }
}
