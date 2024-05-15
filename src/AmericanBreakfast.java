import eatable.*;

import java.util.ArrayList;
import java.util.List;

public class AmericanBreakfast implements Breakfast {
    List<Food> MainDish;
    Liquid Coke;
    public AmericanBreakfast(){
        MainDish =new ArrayList<>();
        Coke= new Liquid("Coke",210, 500, 1);

        Food egg = new Food("Egg",185, 120);
        MainDish.add(egg);

        Food bacon = new Food("Bacon",172, 13.36);
        MainDish.add(bacon);

        Food pancakes = new Food("Pancakes",172, 13.36);
        MainDish.add(pancakes);

    }

    @Override
    public void serving() {
        int amountKcal;
        amountKcal=Food.TotalKcal(MainDish);
        double amountweight;
        amountweight=Food.TotalWeight(MainDish);

        amountKcal += Liquid.TotalKcal(Coke);
        amountweight += Liquid.TotalWeight(Coke);

        System.out.println("Prepared your American breakfast which contains "+ amountKcal+" kkcal "+" and total weight "
                + amountweight+" g with your beverage " + Coke);
    }
}


