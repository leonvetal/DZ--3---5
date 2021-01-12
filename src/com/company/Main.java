package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand1 = new Random();
//       Human human1= Human.scanHum();
//       Human human2= Human.scanHum();
//        Man a=new Man(false,"shfvfv","fff",55,555);
        Man human1= new Man(true,"Ivan","Ivanov",180,80);
        Woman human2= new Woman(false,"Ira","Irinova",170,50);
//        Human = new Human(false,"Ira","Irinova",150,50);
        Human humanSr= new Human(false,"xxx","xxxx",160,45);

//        Human baby = new Human(rand1.nextBoolean(), "xx","yyyy",50,3);
//        humanSr.speak(human1,human2);
//        humanSr.obshestvo(human1,human2);
//        humanSr.vmeste(human1,human2);
        humanSr.relat(human1,human2);
//        Human bab= Born.bornBaby(human1,human2);
//        System.out.println(baby1);
//		float r = human1.rost-human2.rost;
//		float r1 = ((r / human2.rost) * 100);
//		System.out.println(human1);



    }

}
