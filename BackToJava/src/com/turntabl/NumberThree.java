package com.turntabl;

import java.util.Random;

public class NumberThree {

    public void printTextOfNumber(){
        int rand=new Random().ints(0,10).findFirst().getAsInt();

        switch (rand){
            case 0:
                System.out.println("Zero");break;
            case 1:
                System.out.println("One");break;
            case 2:
                System.out.println("Two");break;
            case 3:
                System.out.println("Three");break;
            case 4:
                System.out.println("Four");break;
            case 5:
                System.out.println("Five");break;
            case 6:
                System.out.println("Six");break;
            case 7:
                System.out.println("Seven");break;
            case 8:
                System.out.println("Eight");break;
            default:
                System.out.println("Nine");

        }
    }
}
