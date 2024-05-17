package pl.globallogic.sessions.session4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExamples {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalDateTime creationDate = LocalDateTime.now();
        LocalDateTime customDateTime = LocalDateTime.of(2024,6,9,14,33);
        LocalDate date = LocalDate.of(2024,05,10);

        System.out.println(customDateTime);


    }
}
