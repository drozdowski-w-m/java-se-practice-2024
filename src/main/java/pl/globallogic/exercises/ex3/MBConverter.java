package pl.globallogic.exercises.ex3;

public class MBConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0)
            System.out.println("Invalid value");
        else {
            int megaBytes = (int)(kiloBytes/1024);
            int restBytes = kiloBytes%1024;

            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+restBytes+" KB");
        }

    }

    public static void main(String args[]){
//tests
        int testValues[] = {2500, -1024, 5000};

        for (int i = 0 ; i<testValues.length ; i++ ){
            printMegaBytesAndKiloBytes(testValues[i]);
        }

    }
}
