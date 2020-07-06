package ladder.domain;

import java.util.List;

public class Line {
    private final List<Boolean> bridgeStates;

    public static Line newInstance(List<Boolean> bridgeStates) {
        return new Line(bridgeStates);
    }

    public Line(List<Boolean> bridgeStates) {
        this.bridgeStates = bridgeStates;
    }

    public Boolean get(int index) {
        return bridgeStates.get(index);
    }

    public int size() {
        return bridgeStates.size();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Boolean state : bridgeStates) {
            appendColumn(result);
            appendBridge(result, state);
        }
        appendColumn(result);

        return "  " + String.valueOf(result);
    }

    private void appendColumn(StringBuilder result) {
        result.append("|");
    }

    private void appendBridge(StringBuilder result, Boolean state) {
        if (state) {
            result.append("------");
        }

        if (!state) {
            result.append("      ");
        }
    }
}
