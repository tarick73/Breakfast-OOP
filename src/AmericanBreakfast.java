import eatable.*;

import java.util.ArrayList;

public class AmericanBreakfast extends Breakfast {
    public AmericanBreakfast(){
        ArrayList<Food> MainDish=new ArrayList<>();
        Food egg = new Food("Egg",185, 120);
        MainDish.add(egg);

        Food bacon = new Food("Bacon",172, 13.36);
        MainDish.add(bacon);

        Food pancakes = new Food("Pancakes",172, 13.36);
        MainDish.add(pancakes);
    }
    @Override
    void serving() {
        System.out.println("Preparing your American breakfast");
    }
}
