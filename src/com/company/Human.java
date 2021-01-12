package com.company;

import java.util.Random;
import java.util.Scanner;

public class Human {
    boolean gender;
    String name, surname;
    float rost, ves;

    public Human(boolean gender, String name, String surname, float rost, float ves) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.rost = rost;
        this.ves = ves;
    }



    @Override
    public String toString() {
//        return "Human{" +
//                "gender=" + gender +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", rost=" + rost +
//                ", ves=" + ves +
//                '}';
        return "";
    }
    public boolean speak(Object a, Object b) {
        Human firstHum = (Human) a;
        Human secHum = (Human) b;
        System.out.println("Будут ли общаться?");
        if (!firstHum.gender && !secHum.gender) {
            System.out.println("Да, жен+жен");
            return true;
        }
        if (firstHum.gender && !secHum.gender) {
            System.out.println("Да, муж+жен");
            return true;
        }
        if (!firstHum.gender && secHum.gender) {
            System.out.println("Да, жен+муж");
            return true;
        }
        if (firstHum.gender && secHum.gender) {
            Random rand = new Random();
            if (rand.nextBoolean()) {
                System.out.println("Да, муж+муж, вер. 50%");
                return true;
            } else {
                System.out.println("Нет, муж+муж, вер. 50%");
                return false;
            }

        }
        System.out.println("SPEAK==NO");
        return false;

    }

    public boolean obshestvo(Object a, Object b) {
        Human firstHum = (Human) a;
        Human secHum = (Human) b;
        Random rand = new Random();
        double r1=rand.nextDouble();
        System.out.println("Будут ли терпеть друг друга?");
        System.out.println(r1);
        if (!firstHum.gender && !secHum.gender) {
            if ( r1< 0.05) {
                System.out.println("Да, жен+жен,с вероятностью 5%");
                return true;
            } else {
                System.out.println("Нет, жен+жен,с вероятностью 95%");
                return false;
            }

        }
        if ((firstHum.gender && !secHum.gender)||(!firstHum.gender && secHum.gender)) {
            if (r1 < 0.7) {
                System.out.println("Да,муж+жен, с вероятностью 70%");
                return true;
            } else {
                System.out.println("Нет, муж+жен, с вероятностью 30%");
                return false;
            }

        }
//        if (!firstHum.gender && secHum.gender) {
//            Random rand = new Random();
//            if (rand.nextInt(1) < 0.7) {
//                System.out.println("Да,жен+муж, с вероятностью 70%");
//                return true;
//            } else {
//                System.out.println("Нет, жен+муж, с вероятностью 30%");
//                return false;
//            }
//
//        }
        if (firstHum.gender && secHum.gender) {
            if (r1 <= 0.056) {
                System.out.println("Да, муж+муж,с вероятностью 5,6%");
                return true;
            } else {
                System.out.println("Нет, муж+муж, с вероятностью 94,4%");
                return false;
            }

        } else {
            System.out.println("Obsh==NO!!");
            return false;
        }

    }
    public boolean vmeste(Object a, Object b) {
        Human firstHum = (Human) a;
        Human secHum = (Human) b;
        System.out.println("Будут ли проводить время вместе?");
        Random rand = new Random();
        float r = ((Math.abs(firstHum.rost - secHum.rost)) / firstHum.rost) * 100;

//        System.out.println(r);
        double r1=rand.nextDouble() ;
        System.out.println(r1);
        if ((r > 10) && (r1 < 0.85)) {
            System.out.println("Да,разница в росте= "+ r+"%,  вер. 85%");
            return true;
        }
        else if ((r <= 10) && (r1 < 0.95)) {
            System.out.println("Да,разница в росте= "+ r+"%,  вер. 95%");
            return true;
        } else {
            System.out.println("Не будут");
            return false;
        }
    }
    public Human relat(Object a, Object b){
        Human firstHum = (Human) a;
        Human secHum = (Human) b;
        if ((firstHum.gender&&secHum.gender)||(!firstHum.gender&&!secHum.gender)){
//            Man mun=new Man(true,"d","d",12,3);
 //           mun.bornBaby(firstHum,secHum);
            System.out.println(speak(firstHum,secHum));
            System.out.println(obshestvo(firstHum,secHum));
            System.out.println(vmeste(firstHum,secHum));
            System.out.println("Не родят, однополые");
            return null;
        }
        if (speak(firstHum,secHum)&&obshestvo(firstHum,secHum)&&vmeste(firstHum,secHum)){
            //           Human bab1=Born.bornBaby(firstHum,secHum);
            Woman wuman= new Woman(false,"xxx","xxxx",160,45);
            wuman.bornBaby (firstHum,secHum);
            return new Human(false,"f","ff,",155,56);
        }
        else {
            System.out.println("Не вышло, разбежались");
            return null;
        }

    }
    public static Human scanHum(){
        Scanner sc= new Scanner(System.in);
        boolean a;
        String b,c, a1;
        float d,e;
        System.out.println("Пол?//y,m for man");
        a1= sc.next();
//        a= sc.hasNext("m");
        String a2="y" ;
        String a3="n";
        a= a1.equals(a2);
        sc.nextLine();
        System.out.println("Имя?");
        b= sc.next();
        System.out.println("Фамилия?");
        c=sc.next();
        System.out.println("Рост?");
        d=sc.nextFloat();
        System.out.println("Вес?");
        e= sc.nextFloat();
        Human hum1=new Human(a,b,c,d,e);
        return hum1;

    }


}
