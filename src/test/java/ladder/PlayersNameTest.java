package ladder;

import ladder.domain.PlayersName;
import ladder.domain.Users;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PlayersNameTest {
    @Test
    void nullCheck() {
        assertThatThrownBy(() -> {
            PlayersName playersName = PlayersName.from(null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void invalidNames() {
        assertThatThrownBy(() -> {
            PlayersName playersName = PlayersName.from("john,christina");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void getUsers() {
        PlayersName playersName = PlayersName.from("john,tom,jenny");

        Users users = playersName.getUsers();

        assertThat(users.toString()).isEqualTo(" john    tom  jenny  ");
    }
}
