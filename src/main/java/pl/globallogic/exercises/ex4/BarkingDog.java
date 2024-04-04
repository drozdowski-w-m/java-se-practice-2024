package pl.globallogic.exercises.ex4;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;

        if ( ((hourOfDay < 8)||(hourOfDay>22)) && barking )
            return true;
        else
            return false;

    }



    public static void main(String args[]){
//tests
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
}
