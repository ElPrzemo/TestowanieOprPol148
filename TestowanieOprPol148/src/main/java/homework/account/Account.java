package homework.account;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RequiredArgsConstructor
public class Account {
    //Napisz testy dla tej klasy podobnie jak w klasie CarTest2. Jednak zauważ ze tutaj
    //wstrzykiwany jest LocalDateTimeProvider a nie LocalDateTime
    private final LocalDateTimeProvider localDateTimeProvider;

    public boolean isDiscount() {
        LocalDateTime now = localDateTimeProvider.getLocalDateTime();

        LocalDateTime discountStartTime = LocalDateTime.of
                (
                        LocalDate.of(2023, 9, 4),
                        LocalTime.of(15, 30)
                );

        return now.isAfter(discountStartTime)
                && now.isBefore(discountStartTime.plusHours(2));
    }
}
