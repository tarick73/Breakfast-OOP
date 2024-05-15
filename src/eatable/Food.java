package eatable;
import java.util.ArrayList;
import java.util.List;

public class Food {
    private final String name;
    private final int kcal;
    private final double weight;
    public Food(String name, int kcal, double weight) {
        this.name = name;
        this.kcal = kcal;
        this.weight = weight;
    }

    public static int TotalKcal(List<Food> MainDish){
        int totalKcal = 0;
        for (Food mainDish : MainDish) {
            totalKcal += mainDish.kcal;
        }
        return totalKcal;
    }

    public static double TotalWeight(List<Food> MainDish){
        double totalWeight = 0.0;
        for (Food mainDish : MainDish) {
            totalWeight += mainDish.weight;
        }
        return totalWeight;
    }

}
