package com.gameservice;

import com.gameservice.Abstract.CheckService;
import com.gameservice.Adapter.MernisCheck;
import com.gameservice.Concrete.*;
import com.gameservice.Entities.Campaign;
import com.gameservice.Entities.Game;
import com.gameservice.Entities.Player;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Ömer", "Diner", "52747677724", 2001, 1);
        Player player2 = new Player("test", "case", "54864566256", 1992, 22);

        Game game1 = new Game("Call of Duty", "Activision", 199.0);
        Game game2 = new Game("FIFA 2022", "EA", 250);

        Campaign noCampaign = new Campaign("No campaign", 0, 0);
        Campaign summerCampaign = new Campaign("Summer", 15, 1);

        //checks mernis before adding
        PlayerManager playerManagerwithMernis = new PlayerManager(new MernisCheck());

        //default - return true for everyone
        PlayerManager playerManager = new PlayerManager(new PlayerCheckService());

        SalesManager salesManager = new SalesManager();

        GameManager gameManager = new GameManager();

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.updateCampaign(noCampaign, 50);

        playerManagerwithMernis.addPlayer(player1);
        playerManager.addPlayer(player2);
        playerManager.deletePlayer(player2);

        salesManager.sellGame(player1, game1, summerCampaign);
        salesManager.sellGame(player1, game2, noCampaign);

        playerManagerwithMernis.updatePlayer(player1);

       // gameManager.updateGameInfo(game2);

    }
}
