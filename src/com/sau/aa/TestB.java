package com.sau.aa;

public class TestB {
    public static void main(String[] args) {
        Hi ob1 = new Hi();

        Hi ob2 = new Hi(50);

        // การใช้งาน obj/instance คือกรใช้งาน data และ method
        // การใช้งาน data คือการกำหนดค่าให้มันใหม่ หรือ เอาค่ามันมาใช้่

        ob1.aa = 99;
        System.out.println(ob1.aa + ob2.aa);
        //การใช้งาน method สั่งให้ method นั้นๆ ทำงาน
        ob1.showA();
        ob2.showA();
        ob2.show();
    }
}

// [ Show Ram ]
//  [ob1]
//  - aa = 90
//  - showA()
//  - show()
//  [ob2]
//  - aa = 50
//  - showA()
//  - show()
