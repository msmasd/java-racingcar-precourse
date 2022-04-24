package racingcar.domain;

public class Car {
    private final Name name;
    private final Position position = new Position();

    public Car(Name name) {
        this.name = name;
    }
}
