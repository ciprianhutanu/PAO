package org.example.lab3.test;

import org.example.lab3.animal.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Barza",2);
        animal2.eat("frogs");
        animal2.eat();
    }
}
