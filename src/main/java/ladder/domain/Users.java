package ladder.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Users {
    private final List<User> users;

    private Users(String names) {
        this.users = Arrays.stream(names.split(",")).map(User::from).collect(Collectors.toList());
    }

    public static Users from(String names) {
        return new Users(names);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (User user : this.users) {
            result.append(user.toString()).append("  ");
        }

        return result.toString();
    }
}
