package com.gameservice.Concrete;

import com.gameservice.Abstract.CheckService;
import com.gameservice.Abstract.PlayerService;
import com.gameservice.Entities.Player;

public class PlayerManager implements PlayerService {
    CheckService checkService;

    public PlayerManager(CheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void addPlayer(Player player) {
        if (checkService.checkPlayerInfo(player)) {
            System.out.println("Oyuncu sisteme eklendi:" + player.toString());
        } else {
            System.out.println("Bilgilerde hata var, tekrar deneyiniz.");
        }
    }

    @Override
    public void deletePlayer(Player player) {
        System.out.println(player.getId() + " id numaralı oyuncu sistemden silindi.");
    }

    @Override
    public void updatePlayer(Player player) {
        System.out.println(player.getName() + " adlı oyuncunun kaydı güncellenecek..");
    }
}
