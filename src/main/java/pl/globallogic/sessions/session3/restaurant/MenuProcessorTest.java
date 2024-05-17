package pl.globallogic.sessions.session3.restaurant;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MenuProcessorTest
{
    public static void main(String[] args)
    {
        List<Dish> dishList = new ArrayList<>(
                List.of(
                        Dish.of("Pasta", 450, 30, false, "pasta", "cheese", "tomato", "olive oil"),
                        Dish.of("Pizza", 600, 20, false, "flower", "cheese", "tomato", "ham"),
                        Dish.of("Hot dog", 250, 15, false, "white bread", "sausage", "mustard"),
                        Dish.of("Ham sandwich", 250, 10, false, "bread", "ham", "sauce", "salad"),
                        Dish.of("Tofu sandwich", 120, 5, true, "tofu"),
                        Dish.of("Vegan biryani", 150, 30, true, "soy", "olive oil", "bread", "salad")
                )
        );
        Menu lunchMenu = new Menu("Lunch menu", dishList);
        MenuProcessor processor = new MenuProcessor(lunchMenu);
        System.out.println("Total calories in lunch menu: "+processor.getTotalCalories());
        System.out.println("Veg options in lunch menu: "+ processor.getVegetarianDishes());
        System.out.println("Dishes with lowest calories: "+ processor.getTop3DishByCalories());
    }
}
