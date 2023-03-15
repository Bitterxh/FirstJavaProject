package com.xh._第三部分.polymorphism;

public class Scenes {

    /**
     *这样猫有多种形态，它可以是猫，也可以是动物，把猫当成动物来看
     *把子类的对象赋给父类的引用（对象）称为向上转型 向上转型会屏蔽掉子类特有的方法
     *它可以是大象，也可以是动物，一个对象拥有多种形态称为它的多态
     *多态：把不同的数据类型统一
     */
    public static void main(String[] args) {
//        Cat c = new Cat();
//        Dog d = new Dog();
//        ShitShovelOfficer shovelOfficer = new ShitShovelOfficer();
//        shovelOfficer.foodeat(c);
//        shovelOfficer.foodeat(d);

        Animal ani1 =  new Cat();
        Animal ani2 =  new Dog();
        Animal ani3 =  new Elephant();
//        ani1.catchMouse(); 站在动物的角度上是不能抓老鼠的
//        ShitShovelOfficer shovelOfficer = new ShitShovelOfficer();
//        shovelOfficer.feed(ani1);
//        shovelOfficer.feed(ani2);
//        shovelOfficer.feed(ani3);
        //向下转型
        Cat c = (Cat)ani1;
        c.catchMouse();//猫又可以抓老鼠了
    }
}
