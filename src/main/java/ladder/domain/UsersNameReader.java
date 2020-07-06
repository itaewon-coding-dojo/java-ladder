package ladder.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UsersNameReader {
    private final String names;

    private UsersNameReader(String names) {
        this.validator(names);
        this.names = names;
    }

    public static UsersNameReader newInstace(String names) {
        return new UsersNameReader(names);
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

    public Users convertNamesToUsers() {
        List<User> userNames = Arrays.stream(this.names.split(","))
                .map(User::newInstance)
                .collect(Collectors.toList());

        return Users.newInstance(userNames);
    }
}
