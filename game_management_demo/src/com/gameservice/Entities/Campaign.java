package com.gameservice.Entities;

public class Campaign {
    private String name;
    private double discount;
    private int campaign_id;

    public Campaign(String name, double discount, int campaign_id) {
        this.name = name;
        this.discount = discount;
        this.campaign_id = campaign_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCampaign_id() {
        return campaign_id;
    }

    public void setCampaign_id(int campaign_id) {
        this.campaign_id = campaign_id;
    }
}
