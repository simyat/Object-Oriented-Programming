package expert002;

import expert001_03.AmericaTire;
import expert001_03.Car;
import expert001_03.KoreaTire;
import expert001_03.Tire;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void 자동차_코리아타이어_장착_타이어브랜드_테스트(){
        expert001_03.Tire tire1 = new KoreaTire();
        expert001_03.Car car1 = new expert001_03.Car();
        car1.setTire(tire1);

        assertEquals("장착된 타이어: 코리아 타이어", car1.getTireBrand());
    }

    @Test
    public void 자동차_미국타이어_장착_타이어브랜드_테스트(){
        Tire tire2 = new AmericaTire();
        expert001_03.Car car2 = new Car();
        car2.setTire(tire2);

        assertEquals("장착된 타이어: 미국 타이어", car2.getTireBrand());
    }
}
