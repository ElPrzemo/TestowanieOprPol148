package zad9;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.time.Month;

@RequiredArgsConstructor
public class Tire {
    private final LocalDateTime localDateTime;

    public boolean isWinter() {
        if (Month.JANUARY.equals(localDateTime.getMonth()))
            return true;

        return false;
    }

}
