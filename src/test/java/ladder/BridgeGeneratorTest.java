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

        bridgeGenerator.create();

        assertThat(bridgeGenerator.getBridgeStates()).hasSize(3);
    }
}
