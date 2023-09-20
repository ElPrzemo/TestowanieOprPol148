package zad7;

import java.time.LocalDateTime;
import java.time.Month;

public class Tire {
//    private final boolean isWinter;
//
//    public Tire(boolean isWinter) {
//        this.isWinter = isWinter;
//    }
//
//    public boolean isWinter() {
//        return isWinter;
//    }

    public boolean isWinter() {
        return false;
    }

    public boolean isWinter2() {
        if (Month.JANUARY.equals(LocalDateTime.now().getMonth()))
            return true;

        return false;
    }
}
