package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 자동차는_이름과_위치를_가질_수_있다() {
        new Car(new Name("mycar"), new Position());
    }

    @Test
    void 자동차를_출력할_때_자동차_이름과_현재_위치를_출력할_수_있다() {
        Car mycar = new Car(new Name("mycar"), new Position(0));
        assertThat(mycar.print()).isEqualTo("mycar : ");

        Car car = new Car(new Name("car"), new Position(2));
        assertThat(car.print()).isEqualTo("car : --");
    }
}
