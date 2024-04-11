package pl.globallogic.exercises.ex39;

public class Holden extends Car{
    public Holden(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public String startEngine(){
        this.engine = true;
        return "Holden -> Starting engine";
    }
    @Override
    public String brake(){
        return "Holden -> braking";
    }
    @Override
    public String accelerate(){
        return "Holden -> accelerating";
    }
}
