package eatable;

import java.util.ArrayList;

public class Liquid {
    protected String bevarage;
    protected int kcal;
    protected int mililiters;
    protected int density;

    public Liquid(String bevarage, int kcal, int mililiters, int density) {
        this.bevarage = bevarage;
        this.kcal = kcal;
        this.mililiters = mililiters;
        this.density = density;
    }

    public String getBevarage() {
        return bevarage;
    }

    public static int TotalKcal(Liquid beverage){
        return beverage.kcal;
    }

    public static int TotalWeight(Liquid beverage){
        return beverage.mililiters*beverage.density;
    }
}
