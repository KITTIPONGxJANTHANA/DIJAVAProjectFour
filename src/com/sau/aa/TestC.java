package com.sau.aa;

public class TestC {
    public static void main(String[] args) {
        Hey ob1 = new Hey();

        Hey ob2 = new Hey();

        Hey ob3 = new Hey();

        ob1.a = 1000;

        ob3.b = 999;

        Hey.b = 555;
        Hey.showHey();
        System.out.println(Hey.b);
        System.out.println(ob1.b);
        System.out.println(ob2.b);
        System.out.println(ob3.b);
    }
}

// [ Show Ram ]
//  [ob1]                                       //  [ob2]
//  - aa = 10                                   //  - aa = 10
//  - static b = 20 -> 9999 -> 55555            //  - static b = 20 -> 9999 -> 55555
//  - showHi()                                  //  - showHi()
//  - static showHey()                          //  - static showHey()
//  - metA()                                    //  - metA()
//  - static metB()                             //  - static metB()
//  [ob3]
//  - aa = 10
//  - static b = 20 -> 9999 -> 55555
//  - showHi()
//  - static showHey()
//  - metA()
//  - static metB()
