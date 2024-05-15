package eatable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class FoodTest {

    @Test
    public void testTotalKcal() {
        // Create a list of Food objects
        List<Food> mainDishes = List.of(
                new Food("Pizza", 300, 0.5),
                new Food("Burger", 450, 0.3),
                new Food("Pasta", 250, 0.4)
        );

        // Calculate the total calories
        int totalKcal = Food.TotalKcal(mainDishes);

        // Assert the total calories
        assertEquals(1000, totalKcal);
    }


    @Test
    void testTotalWeight() {
        // Create a list of Food objects
        List<Food> mainDishes = List.of(
                new Food("Pizza", 300, 0.5),
                new Food("Burger", 450, 0.3),
                new Food("Pasta", 250, 0.4)
        );

        // Calculate the total weight
        double totalWeight = Food.TotalWeight(mainDishes);

        // Assert the total weight
        assertEquals(1.2, totalWeight, 0.00001f);
    }

    @Test
    public void testEmptyList() {
        // Create an empty list of Food objects
        List<Food> mainDishes = List.of();

        // Calculate the total calories and weight
        int totalKcal = Food.TotalKcal(mainDishes);
        double totalWeight = Food.TotalWeight(mainDishes);

        // Assert the total calories and weight
        assertEquals(0, totalKcal);
        assertEquals(0.0, totalWeight);
    }

    @Test
    public void testSingleItemList() {
        // Create a list with a single Food object
        List<Food> mainDishes = List.of(
                new Food("Salad", 150, 0.2)
        );

        // Calculate the total calories and weight
        int totalKcal = Food.TotalKcal(mainDishes);
        double totalWeight = Food.TotalWeight(mainDishes);

        // Assert the total calories and weight
        assertEquals(150, totalKcal);
        assertEquals(0.2, totalWeight);
    }
}
