package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        // Overloading -> casting
        pollObj(queen);

        pollObj(worker);

        pollObj(drone);
        
    }

    private static void pollObj(HonnyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }


}

