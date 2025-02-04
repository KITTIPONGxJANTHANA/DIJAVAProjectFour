package com.sau.wow;

public class DtiSAU {
    //data member

    String name;
    int birthYear;
    int age;
    double high = 100;

    //method member

    public void showHi(){
        System.out.println("Hi...." + name);
    }

    public void ShowAge(){
        age = 2568 - birthYear;
        System.out.println("Your age" + age);
    }
}
