package zad9;

import java.util.List;

public class Car {
    private List<Tire> tires;

    public Car(List<Tire> tires) {
        this.tires = tires;
    }

    public boolean isCanDriveInWinter() {
        for (Tire tire : tires) {
            if (!tire.isWinter())
                return false;
        }
        return true;
    }
}
