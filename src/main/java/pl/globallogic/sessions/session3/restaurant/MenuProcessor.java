package pl.globallogic.sessions.session3.restaurant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MenuProcessor {

    private Menu menu;

    public MenuProcessor(Menu menu) {
        this.menu = menu;
    }

    //get total menu calories
    public int getTotalCalories(){
        int totalCalories = 0;
        for(Dish dish : menu.getDishes()){
            totalCalories += dish.getCalories();
        }
        return totalCalories;
    }
    // get vegetarian dishes
    public List<Dish> getVegetarianDishes(){
        List<Dish> vegetarianDishes = new ArrayList<>();
        for(Dish dish : menu.getDishes()){
            if (dish.isVegetarian()) vegetarianDishes.add(dish);
        }
        return vegetarianDishes;
    }
    // get dishes with calories less than 200
    public List<Dish> getDishesWithLessThan200(){
        List<Dish> lowCalDishes = new ArrayList<>();
        for(Dish dish : menu.getDishes()){
            if (dish.getCalories() <= 200)
                lowCalDishes.add(dish);
        }
        return lowCalDishes;
    }
    // get dishes with calories greater than 350
    public List<Dish> getDishesWithMoreThan350(){
        List<Dish> result = new ArrayList<>();
        for(Dish dish : menu.getDishes()){
            if (dish.getCalories() >= 350)
                result.add(dish);
        }
        return result;
    }

    // get dishes with cooking time greater than 20 min
    // get dishes with chili
    // get dishes without milk
    // get top 3 dish calories dishes
    public List<Dish> getTop3DishByCalories() {
        List<Dish> dishesCopy = new ArrayList<>(List.copyOf(menu.getDishes()));
        dishesCopy.sort(new DishByCaloriesComparator().reversed());
        return dishesCopy.subList(0,3);
    }
    // get top-3 vegetarian dish with calories less than 200
    public List<Dish> getVegTopDishLowCal(){
        //Streams implementation
        menu.getDishes().stream()
                .sorted(Comparator.comparing(Dish::getCalories))
                .filter(Dish::isVegetarian) //jako lambda .filter(dish -> dish.isVegetarian())
                .filter(dish -> dish.getCalories() < 200)
                .limit(3)
                .toList();

        List<Dish> dishesCopy = new ArrayList<>(List.copyOf(menu.getDishes()));
        dishesCopy.sort(new DishByCaloriesComparator().reversed());
        for (Dish dish : dishesCopy){
            if (dish.isVegetarian() && dish.getCalories() <= 200 )
                return List.of(dish);
            //put into result list
        }
        return null;
        //get first 3 items from the list
    }

}
