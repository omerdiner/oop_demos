package com.gameservice.Concrete;

import com.gameservice.Abstract.CampaignService;
import com.gameservice.Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getName() + " adlı kampanya sisteme eklendi..");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println(campaign.getName() + " adlı kampanya sistemden silindi..");
    }

    @Override
    public void updateCampaign(Campaign campaign, double discount) {
        campaign.setDiscount(discount);
        System.out.println(campaign.getName() + " adlı kampanya güncellendi..\nYeni indirim oranı:" + campaign.getDiscount());
    }
}
