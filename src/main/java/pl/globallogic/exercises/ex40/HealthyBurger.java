package pl.globallogic.exercises.ex40;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, "Brown rye", price);
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        System.out.println("Adding "+healthyExtra1Name+" for "+healthyExtra1Price);
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
        System.out.println("Adding "+healthyExtra2Name+" for "+healthyExtra2Price);
    }
    @Override
    public double itemizeHamburger(){
        double totalValue = this.getPrice() + this.getAddition1Price() + this.getAddition2Price() + this.getAddition3Price() + this.getAddition4Price() + this.healthyExtra1Price + this.healthyExtra2Price;
        return totalValue;
    }
}
