package pl.globallogic.exercises.ex33;

public class Calculator {
    Floor floor;
    Carpet carpet;

     public Calculator(Floor floor, Carpet carpet) {
         this.floor = new Floor(floor.length, floor.width);
         this.carpet = new Carpet(carpet.getCost());
     }

     public double getTotalCost() {
         return this.floor.getArea() * this.carpet.getCost();
     }

     public static void main(String[] args) {
//tests
         Carpet carpet = new Carpet(3.5);
         Floor floor = new Floor(2.75, 4.0);
         Calculator calculator = new Calculator(floor, carpet);
         System.out.println("total= " + calculator.getTotalCost());
         carpet = new Carpet(1.5);
         floor = new Floor(5.4, 4.5);
         calculator = new Calculator(floor, carpet);
         System.out.println("total= " + calculator.getTotalCost());

     }
}
