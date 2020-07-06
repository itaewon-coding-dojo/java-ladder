package ladder.domain;

import java.util.List;

public class Users {
    private final List<User> users;

    private Users(List<User> users) {
        this.users = users;
    }

    public static Users newInstance(List<User> users) {
        return new Users(users);
    }

    public User get(int index) {
        return this.users.get(index);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (User user : this.users) {
            result.append(user.toString()).append("  ");
        }

        return result.toString();
    }

    public int getNumberOfUsers() {
        return users.size();
    }
}
