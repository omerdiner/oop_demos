package com.gameservice.Concrete;

import com.gameservice.Abstract.CheckService;
import com.gameservice.Entities.Player;

public class PlayerCheckService implements CheckService {
    @Override
    public boolean checkPlayerInfo(Player player) {
        return true;
    }
}
