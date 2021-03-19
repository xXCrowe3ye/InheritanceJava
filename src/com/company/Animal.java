package com.company;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int weight;
    private int size;


    public Animal (String name, int brain, int body, int weight, int size) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.size = size;
    }

    public void move(int speed) {
        System.out.println ("Animal is moving at " + speed + " m/s");
    }

    public void run(int speed){
        System.out.println ("Animal is running at " + speed + " m/s");
    }


    public void eat(){
        System.out.println ("gimme fockin food m8");
    }

    public String getName () {
        return name;
    }

    public int getBrain () {
        return brain;
    }

    public int getBody () {
        return body;
    }

    public int getWeight () {
        return weight;
    }

    public int getSize () {
        return size;
    }

}

