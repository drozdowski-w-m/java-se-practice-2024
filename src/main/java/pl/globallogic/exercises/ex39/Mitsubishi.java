package pl.globallogic.exercises.ex39;

public class Mitsubishi extends Car{

    public Mitsubishi(String name, int cylinders){
        super(name, cylinders);

    }
    @Override
    public String startEngine(){
        this.engine = true;
        return "Mitsu -> Starting engine";
    }
    @Override
    public String brake(){
        return "Mitsu -> braking";
    }
    @Override
    public String accelerate(){
        return "Mitsu -> accelerating";
    }
}
