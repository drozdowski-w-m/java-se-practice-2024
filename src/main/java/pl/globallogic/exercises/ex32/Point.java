package pl.globallogic.exercises.ex32;

import java.lang.Math;

public class Point {
    private int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return ( Math.sqrt( (0.0 - x)*(0.0 - x) + (0.0 - y)*(0.0-y) ) );
    }

    public double distance(int x, int y) {
        return ( Math.sqrt( (x - this.x)*(x - this.x) + (y - this.y)*(y-this.y) ) );
    }

    public double distance(Point point) {
        return ( Math.sqrt( (point.getX() - this.x)*(point.getX() - this.x) + (point.getY() - this.y)*(point.getY()-this.y) ) );
    }

    public static void main(String[] args){
//tests
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
