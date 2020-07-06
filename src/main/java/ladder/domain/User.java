package ladder.domain;

public class User {
    private final String name;
    private final int MAX_NUMBER_OF_CHARACTERS = 5;

    private User(String name) {
        this.name = name;
    }

    public static User newInstance(String name) {
        return new User(name);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        int blankCount = MAX_NUMBER_OF_CHARACTERS - name.length();

        return " ".repeat(Math.max(0, blankCount)) + name;
    }
}
