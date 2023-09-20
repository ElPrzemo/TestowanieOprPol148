package zad9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import zad7.Car;
import zad7.Tire;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class CarTest {
    @Mock
    private Tire tire;

    @Test
    void testCarDrivableInWinter() {
        Mockito
                .when(tire.isWinter())
                .thenReturn(true);

        List<Tire> tires = new ArrayList<>();
        tires.add(tire);
        tires.add(tire);
        tires.add(tire);
        tires.add(tire);

        Car car = new Car(tires);

        Assertions.assertTrue(car.isCanDriveInWinter());
    }

}