package pl.globallogic.sessions.session3.restaurant;

public class VegetarianTester implements DishTester{
    @Override
    public boolean test(Dish dish){
        return dish.isVegetarian();
    }
}
