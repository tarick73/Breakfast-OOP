package eatable;

import java.util.ArrayList;

public class Liquid {
    protected String bevarage;
    protected int kcal;
    protected int mililiters;

    public Liquid(String bevarage, int kcal, int mililiters) {
        this.bevarage = bevarage;
        this.kcal = kcal;
        this.mililiters = mililiters;
    }

    public static int TotalKcal(Liquid beverage){
        return beverage.kcal;
    }

    public static int TotalWeight(Liquid beverage){
        return beverage.mililiters;
    }
}
