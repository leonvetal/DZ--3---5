package com.company;

import java.util.Random;
import java.util.Scanner;

public class Woman extends Human implements Born{
    public Woman(boolean gender, String name, String surname, float rost, float ves) {
        super(gender, name, surname, rost, ves);
    }
//    public void bornBaby(Object a, Object b)


    @Override
    public String toString() {
        return "Woman{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", rost=" + rost +
                ", ves=" + ves +
                "} " + super.toString();
    }





}
