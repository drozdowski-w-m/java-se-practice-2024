package pl.globallogic.exercises.ex37;

public class Bedroom {
    private String name;
    Wall wall1, wall2, wall3, wall4;
    Ceiling ceiling;
    Bed bed;
    Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;

        this.wall1 = new Wall(wall1.getDirection());
        this.wall2 = new Wall(wall2.getDirection());
        this.wall3 = new Wall(wall3.getDirection());
        this.wall4 = new Wall(wall4.getDirection());

        this.ceiling = new Ceiling(ceiling.getHeight(), ceiling.getPaintedColor());

        this.bed = new Bed(bed.getStyle(), bed.getPillows(), bed.getHeight(), bed.getSheets(), bed.getQuilt());

        this.lamp = new Lamp(lamp.getStyle(), lamp.isBattery(), lamp.getGlobRating());
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        this.bed.make();
    }

    public static void main(String[] args) {
//tests

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Wojciech Drozdowski", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();

    }
}
