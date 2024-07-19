package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        // Overloading
        pollObj(queen);

        pollObj(worker);

        pollObj(drone);
        
    }

    private static void pollObj(Queen obj){
        output(obj.doYourJob());
        output(obj.fly());
    }

    private static void pollObj(Worker obj){
        output(obj.doYourJob());
        output(obj.fly());
    }
   
    private static void pollObj(Drone obj){
        output(obj.doYourJob());
        output(obj.fly());
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }


}

