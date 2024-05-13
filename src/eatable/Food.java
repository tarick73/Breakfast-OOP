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

    int countKcal(){

        for(int i = 0; i<MainDish.size(); i++){

        }
        return kcal;
    }

}
