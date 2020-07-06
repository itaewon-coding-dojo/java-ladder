package ladder;

import ladder.domain.UsersNameReader;
import ladder.domain.Users;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UsersNameReaderTest {
    @Test
    void nullCheck() {
        assertThatThrownBy(() -> {
            UsersNameReader usersNameReader = UsersNameReader.newInstace(null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void invalidNames() {
        assertThatThrownBy(() -> {
            UsersNameReader usersNameReader = UsersNameReader.newInstace("john,christina");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void getUsers() {
        UsersNameReader usersNameReader = UsersNameReader.newInstace("john,tom,jenny");

        Users users = usersNameReader.convertNamesToUsers();

        assertThat(users.toString()).isEqualTo(" john    tom  jenny  ");
    }
}
