package homework.account;

import lombok.RequiredArgsConstructor;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RequiredArgsConstructor
public class LocalDateTimeProvider {
    private final Clock clock;

    public LocalDateTime getLocalDateTime() {
        return LocalDateTime.now(clock);
    }

    public LocalDate getLocalDate() {
        return getLocalDateTime().toLocalDate();
    }

    public LocalTime getLocalTime() {
        return getLocalDateTime().toLocalTime();
    }
}
