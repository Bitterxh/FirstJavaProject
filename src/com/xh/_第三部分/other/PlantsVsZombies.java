package com.xh._第三部分.other;

public class PlantsVsZombies {
    public static void main(String[] args) {
        Plant plant = new Plant("豌豆射手", 100, 10);
        Zombie zombie = new Zombie("铁桶僵尸", 200, 20);
        plant.fight(zombie);
        zombie.eat(plant);
    }
}
