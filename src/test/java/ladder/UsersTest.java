package ladder;

import ladder.domain.UsersNameReader;
import ladder.domain.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UsersTest {
    Users users;
    @BeforeEach
    void init() {
        users = UsersNameReader.newInstace("john,james,tom,buddy,din").convertNamesToUsers();
    }

    @Test
    @DisplayName("toString")
    void toStringMethod() {
        assertThat(users.toString()).isEqualTo(" john  james    tom  buddy    din  ");
    }

    @Test
    void getNumberOfUsers() {
        assertThat(users.getNumberOfUsers()).isEqualTo(5);
    }
}
