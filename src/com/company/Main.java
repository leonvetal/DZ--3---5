package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Укажите данные первого человека");
       Human human1= Human.scanHum();
        System.out.println("Укажите данные второго человека");
        Human human2= Human.scanHum();
//        Man human1= new Man(true,"Ivan","Ivanov",180,80);
//        Woman human2= new Woman(false,"Ira","Irinova",170,50);
        Human humanSr= new Human(false,"xxx","xxxx",160,45);

//        humanSr.speak(human1,human2);
//        humanSr.obshestvo(human1,human2);
//        humanSr.vmeste(human1,human2);
        humanSr.relat(human1,human2);




    }

}
