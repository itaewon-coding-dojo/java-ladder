package ladder.domain;

import java.util.List;

public class Line {
    private final List<Integer> bridgeStates;

    public static Line newInstance(List<Integer> bridgeStates) {
        return new Line(bridgeStates);
    }

    public Line(List<Integer> bridgeStates) {
        this.bridgeStates = bridgeStates;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int state : bridgeStates) {
            appendColumn(result);
            appendBridge(result, state);
        }
        appendColumn(result);

        return String.valueOf(result);
    }

    private void appendColumn(StringBuilder result) {
        result.append("|");
    }

    private void appendBridge(StringBuilder result, int state) {
        if (state == 1) {
            result.append("----");
        }

        if (state == 0) {
            result.append("    ");
        }
    }
}
