package com.xh._第三部分.polymorphism;

public class ShitShovelOfficer {

    /**
     * 接收到的所有动物都是Animal
     * @param ani
     */
    public void feed(Animal ani){
        ani.eat();
    }

//    public void foodeat(Cat cat){
//        cat.eat();
//    }
//    public void foodeat(Dog dog){
//        dog.eat();
//    }
//    public void foodeat(Elephant elephant){
//        elephant.eat();
//    }
}
