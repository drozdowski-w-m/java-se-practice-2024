package pl.globallogic.exercises.ex48;


public class Interface {



    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 15);
        System.out.println(player);

        player.write();

        player.setHitPoints(6);
        player.setWeapon("Bow");
        System.out.println(player+" should have bow and 6hp");

    }
}
