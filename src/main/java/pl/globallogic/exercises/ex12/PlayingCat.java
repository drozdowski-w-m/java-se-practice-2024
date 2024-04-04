package pl.globallogic.exercises.ex12;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer) {
            if (temperature >= 25 && temperature <= 45)
                return summer;
            else return !summer;
        } else {
            if (temperature >= 25 && temperature <= 35)
                return !summer;
            else
                return summer;
        }
    }

    public static void main(String args[]){
//tests
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}
