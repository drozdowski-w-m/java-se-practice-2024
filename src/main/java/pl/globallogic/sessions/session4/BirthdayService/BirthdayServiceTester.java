package pl.globallogic.sessions.session4.BirthdayService;

import java.time.Month;

public class BirthdayServiceTester {
    public static void main(String[] args) {
        BirthdayManagementService service = new BirthdayManagementService();
        String johnDoe = "John Doe";
        service.addBirthday(johnDoe, 25, 5, 1988);
        service.addBirthday(johnDoe+"1", 20, 8, 1988);
        service.addBirthday(johnDoe+"2", 10, 5, 1988);
        service.getBirthdayFor(johnDoe).ifPresent(System.out::println);

        System.out.printf("John do will have %s years\n",service.getAgeInYear(johnDoe, 2030));
        System.out.printf("John Doe's birthday in %s days\n", service.getDaysUntilBirthday(johnDoe));
        System.out.printf("In august they will have birthday: %s\n", service.getBirthdaysIn(Month.AUGUST));
        System.out.printf("In this month they will have birthday: %s\n", service.getBirthdaysInCurrentMonth());
        System.out.printf("How old are my friends in total %s%n", service.getTotalAgeInYears());
    }
}
