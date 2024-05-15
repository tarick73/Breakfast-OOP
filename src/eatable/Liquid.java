package eatable;

public class Liquid {
    private final String beverage;
    private final int kcal;
    private final int milliliters;
    private final int density;

    public Liquid(String beverage, int kcal, int milliliters, int density) {
        this.beverage = beverage;
        this.kcal = kcal;
        this.milliliters = milliliters;
        this.density = density;
    }

    @Override
    public String toString() {
        return beverage;
    }

    public static int TotalKcal(Liquid beverage){
        return beverage.kcal;
    }

    public static int TotalWeight(Liquid beverage){
        return beverage.milliliters *beverage.density;
    }
}
