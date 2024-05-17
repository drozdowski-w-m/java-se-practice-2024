package pl.globallogic.sessions.session3.restaurant;

import java.util.ArrayList;
import java.util.List;

public class EnhancedMenuProcessor {
    private Menu menu;

    public EnhancedMenuProcessor(Menu menu) {
        this.menu = menu;
    }

    public int totalOfCalories(Menu menu) {
        return totalSumOf(menu, new CaloriesExtractor());
    }

    public int totalCookingTime(Menu menu) {
        return totalSumOf(menu, new CookingTimeExtractor());
    }

    public List<Dish> getVegetarianDishes(Menu menu) {
        return filterBy(menu, List.of(new VegetarianTester()));
    }

    public List<Dish> getDishesLtSpecifiedCalories(Menu menu, int criteria) {
        return filterBy(menu, List.of(new CaloriesTester(criteria, TesterOperators.LT)));
    }

    private List<Dish> filterBy(Menu menu, List<DishTester> dishTesters) {
        List<Dish> result = new ArrayList<>();
        for (Dish dish : menu.getDishes()) {
            boolean isTested = true;
            for (DishTester tester : dishTesters) {
                if (!tester.test(dish)){
                    isTested = false;
                    break;
                }
            }
            if (isTested) result.add(dish);
        }
        return result;
    }

    private int totalSumOf(Menu menu, DishDataExtractor extractor) {
        int total = 0;
        for (Dish dish : menu.getDishes()) {
            total += extractor.extract(dish);
        }
        return total;
    }

}
