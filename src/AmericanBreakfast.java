import eatable.*;

import java.util.ArrayList;

public class AmericanBreakfast extends Breakfast {
    ArrayList<Food> MainDish=new ArrayList<>();
    Liquid Coke = new Liquid("Coke",210, 500, 1);
    public AmericanBreakfast(){
        Food egg = new Food("Egg",185, 120);
        MainDish.add(egg);

        Food bacon = new Food("Bacon",172, 13.36);
        MainDish.add(bacon);

        Food pancakes = new Food("Pancakes",172, 13.36);
        MainDish.add(pancakes);

    }

    @Override
    public void serving() {
        int amountKcal=0;
        amountKcal=Food.TotalKcal(MainDish);
        double amountweight=0;
        amountweight=Food.TotalWeight(MainDish);

        amountKcal += Liquid.TotalKcal(Coke);
        amountweight += Liquid.TotalWeight(Coke);
        System.out.println("Prepared your American breakfast which contains "+ amountKcal+" kkcal "+" and total weight "
                + amountweight+" g");
    }
}
