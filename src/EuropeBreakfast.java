import eatable.*;

import java.util.ArrayList;


public class EuropeBreakfast {
    ArrayList<Food> MainDish=new ArrayList<>();
    Liquid OrangeJuice = new Liquid("Orange Juice",210, 500, 1);
    public EuropeBreakfast(){
        Food egg = new Food("Egg",185, 120);
        MainDish.add(egg);

        Food bacon = new Food("Bacon",172, 13.36);
        MainDish.add(bacon);

        Food pancakes = new Food("Pancakes",172, 13.36);
        MainDish.add(pancakes);

    }
}
