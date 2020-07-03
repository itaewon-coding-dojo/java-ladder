package ladder;

import ladder.domain.BridgeGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BridgeGeneratorTest {
    @Test
    void add() {
        int numberOfUsers = 4;
        int heightOfLadder = 3;
        BridgeGenerator bridgeGenerator = BridgeGenerator.newInstance(numberOfUsers, heightOfLadder);

        bridgeGenerator.add(List.of(true, false, true, false));
        bridgeGenerator.add(List.of(true, false, false, true));
        bridgeGenerator.add(List.of(false, true, false, true));

        assertThat(bridgeGenerator.getBridgeStates()).hasSize(3);
    }
}
