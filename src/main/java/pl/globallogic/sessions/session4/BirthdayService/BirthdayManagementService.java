package pl.globallogic.sessions.session4.BirthdayService;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class BirthdayManagementService {
    private Map<String, LocalDate> birthdays;

    public BirthdayManagementService() {
        birthdays = new HashMap<>();
    }

    public LocalDate addBirthday(String fullName, int day, int month, int year) {
        //construct birthday  date
        LocalDate birthdayDate = LocalDate.of(year, month,day);
        //put the date with name into map
        birthdays.put(fullName, birthdayDate);
        return birthdayDate;
    }

    public Optional<LocalDate> getBirthdayFor(String fullName) {
        if (birthdays.containsKey(fullName)) {
            return Optional.of(birthdays.get(fullName));
        } else {
            return Optional.empty();
        }
    }

    public Integer getAgeInYear(String fullName, int year) {
        LocalDate birthday = getBirthdayFor(fullName).get(); //get na koncu bo Optional (z metody powyzej) i stad sie bierze wart.
        Period period = Period.between(birthday, birthday.withYear(year));

        return period.getYears();
    }

    public int getDaysUntilBirthday(String fullName) {
        //TODO: fix issue with wrong date calculation
        return Period.between(getBirthdayFor(fullName).get(), LocalDate.now()).getDays();
    }


    public Set<String> getBirthdaysIn(Month month) {
        return birthdays.entrySet().stream()
                .filter(bd -> bd.getValue().getMonth() == month)
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());
    }

    public Set<String> getBirthdaysInCurrentMonth() {
        return getBirthdaysIn(LocalDate.now().getMonth());
    }

    public int getTotalAgeInYears() {
        return birthdays.keySet().stream()
                .mapToInt(p -> getAgeInYear(p, LocalDate.now().getYear()))
                .sum();
    }
}
