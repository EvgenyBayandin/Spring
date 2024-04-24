package com;

public class DanceMusic implements Music{

    public void doMyInit(){
        System.out.println("DanceMusic doMyInit");
    }

    public void doMyDestroy(){
        System.out.println("DanceMusic doMyDestroy"); //метод будет работать только с scope singleton
    }

    @Override
    public String getSong() {
        return "Modern dance song";
    }
}
