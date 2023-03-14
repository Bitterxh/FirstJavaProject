package com.xh._第三部分.other;

public class Car {
    String color;
    int speed;
    int seat = 5;
    /**
    *使用构造方法就可以在对象初始化的时候设置基本信息
    * 系统默认在new对象时会自动创建无参构造方法
    * 修改之后的有参构造方法
    */
    public Car(String color, int speed){
        //设置属性信息
        this.color = color;
        this.speed = speed;
    }
    public void run() {
        System.out.println(this.color+"的车能跑"+this.speed+"km/h");
    }
    public static void main(String[] args) {
        Car c1 = new Car("红色",120);
//      c1.color = "红色";
//      c1.speed = 100;
        Car c2 = new Car("蓝色", 180);
//      c2.color = "蓝色";
//      c2.speed = 150;
        c1.run();
        c2.run();
    }
}
