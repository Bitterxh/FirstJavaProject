package com.xh._第三部分.game;

public class Scenes {
    public static void main(String[] args) {
        //向上转型
        Game game1 = new DNF();
        Game game2 = new LOL();
        Game game3 = new CS();
        Player player = new Player();
        player.happy(game1);
        player.happy(game2);
        player.happy(game3);
    }
}
