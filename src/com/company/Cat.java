package com.company;

public class Cat extends Animal {

    private int eyes;
    private int legs;
    private int tail;

    public Cat (String name, int weight, int size, int eyes, int legs, int tail) {
        super (name, 1, 1, weight, size);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }


    private void chew() {
        System.out.println ("chewing me fock1n food");
    }

    public void move(){
        super.move(100);
    }

    public void run(){
        super.move(20);

    }

    @Override
    public void eat () {
        chew();
        System.out.println ("Cat.eat() called");

        super.eat ();
    }
}
