package pl.globallogic.exercises.ex40;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon", "White", 19.10);
        System.out.println("Adding drink and chips for Deluxe!");

    }
    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println("You cannot add anything to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        System.out.println("You cannot add anything to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        System.out.println("You cannot add anything to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        System.out.println("You cannot add anything to a deluxe burger");
    }
    @Override
    public double itemizeHamburger(){
        double totalValue = 19.10;
        return totalValue;
    }


}
