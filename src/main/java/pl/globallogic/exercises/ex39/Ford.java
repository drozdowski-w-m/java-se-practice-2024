package pl.globallogic.exercises.ex39;

public class Ford extends Car{
    public Ford(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public String startEngine(){
        this.engine = true;
        return "Ford -> Starting engine";
    }
    @Override
    public String brake(){
        return "Ford -> braking";
    }
    public String accelerate(){
        return "Ford -> accelerating";
    }
}
