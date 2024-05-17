package pl.globallogic.sessions.session3.restaurant;

public class DishByCaloriesComparator implements java.util.Comparator<Dish> {
    @Override
    public int compare(Dish o1, Dish o2){
        return Integer.compare(o1.getCalories(), o2.getCalories());
    }
}
