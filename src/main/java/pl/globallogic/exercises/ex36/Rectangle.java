package pl.globallogic.exercises.ex36;

public class Rectangle {
    private double width, length;

    public Rectangle(double width, double length) {
        if ( width >= 0 )
            this.width = width;
        else
            this.width = 0;
        if ( length >= 0 )
            this.length = length;
        else
            this.length = 0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.getWidth()*this.getLength();
    }
}
