package ladder;

import ladder.domain.UsersNameReader;
import ladder.domain.Users;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UsersTest {
    @Test
    @DisplayName("toString")
    void toStringMethod() {
        Users users = UsersNameReader.newInstace("john,james,tom,buddy,din").convertNamesToUsers();

        assertThat(users.toString()).isEqualTo(" john  james    tom  buddy    din  ");
    }
}
