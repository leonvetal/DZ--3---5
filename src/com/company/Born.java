package com.company;

import java.util.Random;
import java.util.Scanner;

public interface Born  {
      default void bornBaby(Object a, Object b) {
            Human firstHum = (Human) a;
            Human secHum = (Human) b;
//        Human baby=(Human) c;
            Random rand2 = new Random();
            Scanner scan = new Scanner(System.in);
            boolean gend = rand2.nextBoolean();
            String n, s;
            float r, v;
            System.out.println("У вас родился ребенок!");
            if (gend) {
                  System.out.println("Мальчик!");
            } else {
                  System.out.println("Девочка!");
            }
            System.out.println("имя?");
            n = scan.next();
            System.out.println(n);
            if (firstHum.gender) {
                  s = firstHum.surname;
            } else {
                  s = secHum.surname;

            }
            if (gend && firstHum.gender) {
                  r = (float) ((firstHum.rost + 0.3 * secHum.rost) - firstHum.rost);
                  v = (float) ((firstHum.ves + 0.05 * secHum.ves) - firstHum.ves);
            } else {
                  r = (float) ((secHum.rost + 0.3 * firstHum.rost) - secHum.rost);
                  v = (float) ((secHum.ves + 0.05 * firstHum.ves) - secHum.ves);
            }
            if (gend) {
                  Man baby1 = new Man(gend, n, s, r, v);
                  System.out.println(baby1);
//                  return baby1;
            } else {
                  Woman baby1 = new Woman(gend, n, s+"a", r, v);
                  System.out.println(baby1);
//                  return baby1;
            }


      }


}
