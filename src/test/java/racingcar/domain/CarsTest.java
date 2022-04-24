package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CarsTest {

    @Test
    void 자동차는_여러대로_게임할_수_있다() {
        Car sona = new Car(new Name("sona"), new Position());
        Car x3 = new Car(new Name("x3"), new Position());
        new Cars(Arrays.asList(sona, x3));
    }
}
