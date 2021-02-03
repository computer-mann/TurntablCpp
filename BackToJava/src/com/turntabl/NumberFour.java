package com.turntabl;

import org.w3c.dom.ranges.Range;

import java.util.Random;


public class NumberFour {

    public void needlessToSayWithDoWhile(){
        int rand;
        do {
            rand = new Random().ints(-3,4).findFirst().getAsInt();
            System.out.println(rand);
        }while (rand != 0);
    }

    public void needlessToSayWithWhileLoop()
    {
        int rand=5;
        while(rand != 0){
            rand = new Random().ints(-3,4).findFirst().getAsInt();
            System.out.println(rand);
        }
    }
}
