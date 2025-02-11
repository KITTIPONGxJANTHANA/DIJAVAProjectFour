package com.sau.aa;

public class Hey {
    public int a = 10;   // intstance variable
    public static int b = 20;  //class variable

    public void  showHi(){
        System.out.println("Hi.....");
    }
    public static void showHey(){
        System.out.println("Hey...");
    }
    public void metA(){
        a = 11;
        b = 22;
        showHi();
        showHey();
        // ใช้ได้ทั้งหมด
    }
    public static void metB(){
//        a = 11;    Eroor  static จะใช้ได้แค่ static เท่านั้น
        b = 22;
//        showHi();  Error static จะใช้ได้แค่ static เท่านั้น
        showHey();
    }
}
