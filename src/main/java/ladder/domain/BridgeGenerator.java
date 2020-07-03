package ladder.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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

    public void create() {
        for (int i = 0; i < heigthOfLadder; i += 1) {
            Line line = Line.newInstance(makeRandomStates());
            bridgeStates.add(line);
        }
    }

    private List<Boolean> makeRandomStates() {
        Random random = new Random();

        List<Boolean> states = new ArrayList<>();
        for (int i = 0; i < numberOfUsers - 1; i += 1) {
            addState(random, states, i);
        }

        return states;
    }

    private void addState(Random random, List<Boolean> states, int index) {
        if (states.size() == 0) {
            states.add(random.nextInt() % 2 == 0);
            return;
        }

        if (!states.get(index - 1)) {
            states.add(random.nextInt() % 2 == 0);
            return;
        }

        states.add(false);
    }

    public List<Line> getBridgeStates() {
        return Collections.unmodifiableList(this.bridgeStates);
    }
}
