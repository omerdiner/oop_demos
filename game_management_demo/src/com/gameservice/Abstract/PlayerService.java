package com.gameservice.Abstract;

import com.gameservice.Entities.Player;

public interface PlayerService {
    void addPlayer(Player player);

    void deletePlayer(Player player);

    void updatePlayer(Player player);
}
