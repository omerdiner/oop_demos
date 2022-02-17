package com.gameservice.Concrete;

import com.gameservice.Abstract.SaleService;
import com.gameservice.Entities.Campaign;
import com.gameservice.Entities.Game;
import com.gameservice.Entities.Player;

public class SalesManager implements SaleService {
    @Override
    public void sellGame(Player player, Game game, Campaign campaign) {
        String info = "";
        double price = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);
        info = player.getName() + " " + game.getName() + " adlı oyunu " + price + " TL'ye satın aldı.";
        System.out.println(info);
    }
}
