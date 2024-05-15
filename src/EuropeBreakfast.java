import eatable.*;

import java.util.ArrayList;


public class EuropeBreakfast extends Breakfast {
    ArrayList<Food> MainDish=new ArrayList<>();
    Liquid OrangeJuice  = new Liquid("Orange Juice",112, 500, 1);
    public EuropeBreakfast(){
        Food croissants = new Food("Croissants",463, 140);
        MainDish.add(croissants);

        Food bacon = new Food("Bacon",172, 13.36);
        MainDish.add(bacon);

        Food cheese = new Food("Cheese",200, 50);
        MainDish.add(cheese);

    }



    @Override
    public void serving() {

        int amountKcal=0;
        amountKcal=Food.TotalKcal(MainDish);
        double amountweight=0;
        amountweight=Food.TotalWeight(MainDish);

        amountKcal += Liquid.TotalKcal(OrangeJuice);
        amountweight += Liquid.TotalWeight(OrangeJuice);
        System.out.println("Prepared your Europe Breakfast which contains "+ amountKcal+" kkcal "+" and total weight "
                + amountweight+" g and beverage "+ OrangeJuice.getBevarage());
    }
}
