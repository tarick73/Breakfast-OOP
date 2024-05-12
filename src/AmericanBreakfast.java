import eatable.*;

import java.util.ArrayList;

public class AmericanBreakfast extends Breakfast {
    public AmericanBreakfast(){
        ArrayList<Food> MainDish=new ArrayList<>();
    }
    @Override
    void serving() {
        System.out.println("Preparing your American breakfast");
    }
}
