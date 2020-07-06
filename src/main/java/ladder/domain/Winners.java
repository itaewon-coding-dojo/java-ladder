package ladder.domain;

import java.util.Map;

public class Winners {
    private final Map<String, Integer> winners;

    public Winners(Map<String, Integer> winners) {
        this.winners = winners;
    }

    public static Winners newInstance(Map<String, Integer> winners) {
        return new Winners(winners);
    }

    public Map<String, Integer> getWinners() {
        return this.winners;
    }
}
