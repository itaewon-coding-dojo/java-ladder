package ladder.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BridgeGenerator {
    private final int heigthOfLadder;
    private final int numberOfUsers;
    private final List<Line> bridgeStates = new ArrayList<>();

    public BridgeGenerator(int numberOfUsers, int heightOfLadder) {
        this.heigthOfLadder = heightOfLadder;
        this.numberOfUsers = numberOfUsers;
    }

    public static BridgeGenerator newInstance(int numberOfUsers, int heightOfLadder) {
        return new BridgeGenerator(numberOfUsers, heightOfLadder);
    }

    public void add(List<Boolean> states) {
        Line line = Line.newInstance(states);
        this.bridgeStates.add(line);
    }

    public List<Line> getBridgeStates() {
        return Collections.unmodifiableList(this.bridgeStates);
    }
}
