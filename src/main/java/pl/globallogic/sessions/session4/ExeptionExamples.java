package pl.globallogic.sessions.session4;

import java.io.IOException;

public class ExeptionExamples {
    public static void main(String[] args) {
       // methodWithSleep();
    }

    private static void methodWithSleep() throws InterruptedException {
        try {
            Thread.sleep(5000);
            System.out.println("dddds");
        } catch (InterruptedException | RuntimeException e){
            System.out.println("We were interrupted");
        } finally {
            System.out.println("This block will be executed always - good for cleanup");
        }

    }
}
