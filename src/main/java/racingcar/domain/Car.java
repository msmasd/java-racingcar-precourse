package racingcar.domain;

public class Car {
    private final Name name;
    private final Position position;

    public Car(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String print() {
        return name + " : " + position.print();
    }
}
