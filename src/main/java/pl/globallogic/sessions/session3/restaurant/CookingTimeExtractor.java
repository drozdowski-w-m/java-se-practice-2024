package pl.globallogic.sessions.session3.restaurant;

public class CookingTimeExtractor implements DishDataExtractor{
    @Override
    public int extract(Dish dish){
        return  dish.getCookingTime();
    }
}
