package pl.globallogic.sessions.session2;

public class DoubleValueSupplier<T extends Number> {
    private T number;

    public void set(T number){
        this.number = number;
    }

    public double getDoubleValue(){
        return number.doubleValue();
    }
}
