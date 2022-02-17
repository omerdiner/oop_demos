package com.gameservice.Concrete;

import com.gameservice.Abstract.GameService;
import com.gameservice.Entities.Game;

import java.util.Scanner;

public class GameManager implements GameService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addGame(Game game) {
        System.out.println("Oyun eklendi:" + game.toString());
    }

    @Override
    public void deleteGame(Game game) {
        System.out.println("Oyun silindi:" + game.toString());
    }

    @Override
    public void updateGameInfo(Game game) {
        System.out.println("Oyunun yeni fiyatını giriniz:");
        int newPrice = scanner.nextInt();
        game.setPrice(newPrice);
        System.out.println("Oyun bilgileri güncellendi:" + game.toString());
    }
}
