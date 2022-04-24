package racingcar.domain;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void 자동차는_이름과_위치를_가질_수_있다() {
        new Car(new Name("mycar"));
    }
}
