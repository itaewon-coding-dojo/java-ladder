package ladder.domain;

import java.util.Optional;

public class PlayersName {
    private final String names;

    private PlayersName(String names) {
        this.validator(names);
        this.names = names;
    }

    public static PlayersName from(String names) {
        return new PlayersName(names);
    }

    private void validator(String names) {
        Optional<String> optNames = Optional.ofNullable(names);
        if (optNames.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (String name : names.split(",")) {
            if (name.length() > 5 || name.length() < 1) {
                throw new IllegalArgumentException();
            }
        };
    }
}
