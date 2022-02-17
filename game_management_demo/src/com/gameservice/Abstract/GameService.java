package com.gameservice.Abstract;

import com.gameservice.Entities.Game;

public interface GameService {
    void addGame(Game game);

    void deleteGame(Game game);

    void updateGameInfo(Game game);
}
