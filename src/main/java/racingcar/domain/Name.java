package racingcar.domain;

public class Name {
    public static final int MAX_LENGTH = 5;
    private final String name;

    public Name(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name == null || name.isEmpty() || name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 공백이거나 5자가 넘을 수 없다");
        }
    }
}
