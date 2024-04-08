package pl.globallogic.exercises.ex31;

public class Wall {
    private double width, height;

    public Wall() {
        this.height = 0.0;
        this.width = 0.0;
    }

    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
            this.height = height;
        } else if ( height < 0 ) {
            this.width = width;
            this.height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if ( width >= 0)
            this.width = width;
        else
            this.width = 0;
    }

    public void setHeight(double height) {
        if ( height >= 0 )
            this.height = height;
        else
            this.height = 0;
    }

    public double getArea() {
        return height*width;
    }

    public static void main(String[] args) {
//tests
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
