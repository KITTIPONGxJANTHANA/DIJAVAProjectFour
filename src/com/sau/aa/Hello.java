package com.sau.aa;

public class Hello {
    public int a;
    public int b =  10;


    public void shoA(){
        System.out.println(a);

    }
    public void shoB(){
        System.out.println(b);

    }
    public void shoAB(){
        System.out.println(a+b);
    }

        // constructor
    public Hello(int a) {
        this.a = a;
        System.out.println("Hello.....");

    }

    public Hello(){
        System.out.println("Hi.....");
    }
    public Hello(String x){
        System.out.println("Hey.....");
    }
}
