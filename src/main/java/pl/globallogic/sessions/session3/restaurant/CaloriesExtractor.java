package pl.globallogic.sessions.session3.restaurant;

public class CaloriesExtractor implements DishDataExtractor{
    @Override
    public int extract(Dish dish){
        return  dish.getCalories();
    }
}
