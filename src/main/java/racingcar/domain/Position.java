package racingcar.domain;

import java.util.Objects;

public class Position {
    public static final int INIT_POSITION = 0;
    public static final int MIN_MOVE_VALUE = 0;
    public static final int MAX_MOVE_VALUE = 9;
    public static final int CAN_MOVE_EQUAL_OR_GRATER_THAN = 4;

    private int position;

    public Position() {
        position = INIT_POSITION;
    }

    public Position(int position) {
        this.position = position;
    }

    public void move(int value) {
        moveValidate(value);
        if (value >= CAN_MOVE_EQUAL_OR_GRATER_THAN) {
            position++;
        }
    }

    private void moveValidate(int value) {
        if (value < MIN_MOVE_VALUE || value > MAX_MOVE_VALUE) {
            throw new IllegalArgumentException("전진 판단에 사용되는 값은 0-9 값만 입력받는다");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
