package com.gameservice.Adapter;

import MernisPackage.GCSKPSPublicSoap;
import com.gameservice.Abstract.CheckService;
import com.gameservice.Concrete.PlayerCheckService;
import com.gameservice.Entities.Player;

import java.util.Locale;

public class MernisCheck extends PlayerCheckService {
    @Override
    public boolean checkPlayerInfo(Player player) {
        GCSKPSPublicSoap mernis = new GCSKPSPublicSoap();
        try {
            return mernis.TCKimlikNoDogrula(Long.parseLong(player.getTc()), player.getName().toUpperCase(), player.getSurname().toUpperCase(), player.getBirthYear());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Mernis doğrulamasında hata..");
            return false;
        }


    }
}
