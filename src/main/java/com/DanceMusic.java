package com;
import org.springframework.stereotype.Component;


public class DanceMusic implements Music{

//    private DanceMusic(){}

    //Factory Method/
    public static DanceMusic getDanceMusic(){
        return new DanceMusic();
    }

//    public void doMyInit(){
//        System.out.println("DanceMusic doMyInit");
//    }
//
//    public void doMyDestroy(){
//        System.out.println("DanceMusic doMyDestroy"); //метод будет работать только с scope singleton
//    }

    @Override
    public String getSong() {
        return "Modern dance song";
    }
}
