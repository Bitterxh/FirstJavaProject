package com.xh._第三部分;

public class Zombie {
    String name;
    int hp;
    int attack;

    public Zombie(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void eat(Plant plant){
        System.out.println(this.name+"在吃"+plant.name);
        plant.hp -= this.attack;
        System.out.println(plant.name+"的血量剩余"+plant.hp);
    }
}
