package com.turntabl;

import java.util.Random;

public class NumberTwo
{

    public String randomNumberGen()
    {
        int random=new Random().nextInt(101);
        if(random % 2 ==0 ){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        //System.out.println(random);
        if(random == 0){
            return "frozen";
        }else if(random <= 15){
            return "cold";
        }else if( random <=24 ){
            return "cool";
        }else if( random <=40){
            return "warm";
        }else if( random <= 60){
            return "hot" ;
        }else if( random <= 80){
            return "very hot";
        }else if(random <= 99) {
            return "extremely hot";
        }else{
            return "boiling";
        }
    }
}
