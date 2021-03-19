package com.company;

public class Bear extends Animal {

    private int eyes;
    private int legs;
    private int tails;
    private int cubs;

    public Bear (String name, int weight, int size, int eyes, int legs, int tails, int cubs) {
        super (name, 1, 1, weight, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.cubs = cubs;
    }

    public void hibernate(){

    }

    public void move (int speed) {
        System.out.println ("this f0ckin' bear is moving at " + speed + " m/s");
    }

    public void attack(int damage){

        System.out.println (  + damage + " that's a lot of damage...");


    }
}
