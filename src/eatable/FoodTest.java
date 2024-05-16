package eatable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class FoodTest {

    @Test
    public void testTotalKcal() {
        List<Food> mainDishes = List.of(
                new Food("Pizza", 300, 0.5),
                new Food("Burger", 450, 0.3),
                new Food("Pasta", 250, 0.4)
        );

        int totalKcal = Food.TotalKcal(mainDishes);

        assertEquals(1000, totalKcal);
    }


    @Test
    void testTotalWeight() {
        List<Food> mainDishes = List.of(
                new Food("Pizza", 300, 0.5),
                new Food("Burger", 450, 0.3),
                new Food("Pasta", 250, 0.4)
        );

        double totalWeight = Food.TotalWeight(mainDishes);

        assertEquals(1.2, totalWeight, 0.00001f);
    }

    @Test
    public void testEmptyList() {
        List<Food> mainDishes = List.of();

        int totalKcal = Food.TotalKcal(mainDishes);
        double totalWeight = Food.TotalWeight(mainDishes);

        assertEquals(0, totalKcal);
        assertEquals(0.0, totalWeight);
    }

    @Test
    public void testSingleItemList() {
        List<Food> mainDishes = List.of(
                new Food("Salad", 150, 0.2)
        );

        int totalKcal = Food.TotalKcal(mainDishes);
        double totalWeight = Food.TotalWeight(mainDishes);

        assertEquals(150, totalKcal);
        assertEquals(0.2, totalWeight);
    }
}
