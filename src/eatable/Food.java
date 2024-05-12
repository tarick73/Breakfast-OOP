package eatable;
import java.util.ArrayList;

public class Food {
    protected String name;
    protected int kkcal;
    protected double weight;
    public Food(String name, int kkcal, double weight) {
        this.name = name;
        this.kkcal = kkcal;
        this.weight = weight;
    }

    protected ArrayList<Food> MainDish;


}
