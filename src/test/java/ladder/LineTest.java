package ladder;

import ladder.domain.Line;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @Test
    @DisplayName("toString")
    void toStringMethod() {
        List<Boolean> bridgeStates = List.of(true, false);

        Line line = Line.newInstance(bridgeStates);

        assertThat(line.toString()).isEqualTo("|----|    |");
    }
}
