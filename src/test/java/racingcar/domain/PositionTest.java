package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class PositionTest {
    private Position position;

    @BeforeEach
    void setUp() {
        position = new Position(0);
    }

    @Test
    void 자동차는_전진하는데_전진_조건은_0_9_값을_입력받는다() {
        position.move(0);
        position.move(9);
        assertThatIllegalArgumentException().isThrownBy(() -> position.move(-1));
        assertThatIllegalArgumentException().isThrownBy(() -> position.move(10));
    }

    @Test
    void 자동차는_전진하는데_전진_조건은_4_이상일_경우_전진한다() {
        position.move(3);
        assertThat(position).isEqualTo(new Position(0));

        position.move(4);
        assertThat(position).isEqualTo(new Position(1));
    }

}
