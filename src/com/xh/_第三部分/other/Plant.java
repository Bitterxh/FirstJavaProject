package com.xh._第三部分.other;

public class Plant {
    String name;
    int hp;
    int attack;

    public Plant(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void fight(Zombie zombie){
        System.out.println(this.name+"在打"+zombie.name);
        //僵尸掉血
        zombie.hp -= this.attack;
        System.out.println(zombie.name+"的血量剩余：" + zombie.hp);
    }
}
