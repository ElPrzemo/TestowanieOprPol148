package zad9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class CarTest2 {
    @Mock
    private LocalDateTime now;

    @Test
    void testCarDrivableInWinter() {
//        Mockito
//                .when(tire.isWinter())
//                .thenReturn(true);

//        LocalDateTime now = LocalDateTime.now();

        Mockito
                .when(now.getMonth())
                .thenReturn(Month.JANUARY);

        Tire tire = new Tire(now);

        List<Tire> tires = new ArrayList<>();
        tires.add(tire);
        tires.add(tire);
        tires.add(tire);
        tires.add(tire);

        Car car = new Car(tires);

        Assertions.assertTrue(car.isCanDriveInWinter());
    }

}