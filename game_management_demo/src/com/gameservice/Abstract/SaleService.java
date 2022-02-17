package com.gameservice.Abstract;

import com.gameservice.Entities.Campaign;
import com.gameservice.Entities.Game;
import com.gameservice.Entities.Player;

public interface SaleService {
    void sellGame(Player player, Game game, Campaign campaign);

}
