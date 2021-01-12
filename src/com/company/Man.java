package com.company;

public class Man extends Human{
    public Man(boolean gender, String name, String surname, float rost, float ves) {
        super(gender, name, surname, rost, ves);
    }

    @Override
    public String toString() {
        return "Man{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", rost=" + rost +
                ", ves=" + ves +
                "} " + super.toString();
    }


}
