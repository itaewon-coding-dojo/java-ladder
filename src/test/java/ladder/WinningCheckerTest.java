package ladder;

import ladder.domain.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinningCheckerTest {
    @Test
    void checkWinners() {
        WinningChecker winningChecker = WinningChecker.newInstance();

        Users users = Users.newInstance(List.of(
                User.newInstance("eric"),
                User.newInstance("jimmy"),
                User.newInstance("kim")
        ));
        ExpectingResultReader reader = ExpectingResultReader.newInstance("꽝,1000,2000");
        List<Integer> expectingResultData = reader.convertToResultData();
        BridgeGenerator bridgeGenerator = BridgeGenerator.newInstance(3, 3);
        bridgeGenerator.create();
        List<Line> bridgeStates = bridgeGenerator.getBridgeStates();

        assertThat(winningChecker.checkWinners(users, expectingResultData, bridgeStates)).hasSize(3);
    }
}
