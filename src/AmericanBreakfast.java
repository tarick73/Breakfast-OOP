import eatable.*;

import java.util.ArrayList;

public class AmericanBreakfast extends Breakfast {
    ArrayList<Food> MainDish=new ArrayList<>();
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
        System.out.println("Preparing your American breakfast that contains "+ amountKcal+" kkcal "+" and total weight "+ amountweight+" g");
    }
}
