package ladder;

import ladder.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    @Test
    @DisplayName("toString")
    void toStringMethod() {
        User user = User.newInstance("din");

        assertThat(user.toString()).isEqualTo("  din");
    }
}
