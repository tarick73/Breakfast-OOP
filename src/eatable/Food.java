package eatable;
import java.util.ArrayList;

public class Food {
    protected String name;
    protected int kcal;
    protected double weight;
    public Food(String name, int kcal, double weight) {
        this.name = name;
        this.kcal = kcal;
        this.weight = weight;
    }
    protected ArrayList<Food> MainDish;

    public static int TotalKcal(ArrayList<Food> MainDish){
        int totalKcal = 0;
        for(int i = 0; i<MainDish.size(); i++){
            totalKcal+=MainDish.get(i).kcal;
        }
        return totalKcal;
    }

    public static double TotalWeight(ArrayList<Food> MainDish){
        double totalWeight = 0.0;
        for(int i = 0; i<MainDish.size(); i++){
            totalWeight+=MainDish.get(i).weight;
        }
        return totalWeight;
    }

}
