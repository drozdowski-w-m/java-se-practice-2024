package pl.globallogic.exercises.ex40;

public class Hamburger {
    private String name, meat, breadRollType;
    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double price;
    private double addition1Price, addition2Price, addition3Price, addition4Price;
    public Hamburger(String name, String meat, String breadRollType, double price){
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;

        this.addition1Price = 0.0;
        this.addition2Price = 0.0;
        this.addition3Price = 0.0;
        this.addition4Price = 0.0;

        System.out.println(this.name + " burger on a " +this.breadRollType+ " roll with " +this.meat+ ", price is " +this.price);
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;

        System.out.println("Adding " +addition1Name+ " for an extra " +addition1Price);
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;

        System.out.println("Adding " +addition2Name+ " for an extra " +addition2Price);
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;

        System.out.println("Adding " +addition3Name+ " for an extra " +addition3Price);
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;

        System.out.println("Adding " +addition4Name+ " for an extra " +addition4Price);
    }

    public double getPrice() {
        return price;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public double itemizeHamburger(){
        double totalValue = this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
        return totalValue;
    }
}
