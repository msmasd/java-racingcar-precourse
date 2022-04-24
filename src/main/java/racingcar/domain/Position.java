package racingcar.domain;

public class Position {
    public static final int INIT_POSITION = 0;
    public static final int MIN_MOVE_VALUE = 0;
    public static final int MAX_MOVE_VALUE = 9;

    private final int position;

    public Position() {
        position = INIT_POSITION;
    }

    public Position(int position) {
        this.position = position;
    }

    public void move(int value) {
        moveValidate(value);
    }

    private void moveValidate(int value) {
        if (value < MIN_MOVE_VALUE || value > MAX_MOVE_VALUE) {
            throw new IllegalArgumentException("전진 판단에 사용되는 값은 0-9 값만 입력받는다");
        }
    }
}
