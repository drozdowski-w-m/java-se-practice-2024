package pl.globallogic.exercises.ex39;

public class Car {
    protected boolean engine;
    private String name;
    private int cylinders, wheels;

    public Car(String name, int cylinders){
        this.wheels = 4;
        this.engine = false;
        this.name = name;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        this.engine = true;
        return "Car -> Starting engine";
    }
    public String brake(){
        return "Car -> braking";
    }
    public String accelerate(){
        return "Car -> accelerating";
    }
}
