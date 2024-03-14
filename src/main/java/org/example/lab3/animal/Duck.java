package org.example.lab3.animal;

import java.util.Objects;

public class Duck extends Bird{
    private int length;

    public Duck(String name, int noOfLegs, String colour, int length) {
        super(name, noOfLegs, colour);
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println("I can swim!");
    }

    @Override
    public void sing() {
        System.out.println("QUACK");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return length == duck.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}
