package ladder.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WinningChecker {
    public static WinningChecker newInstance() {
        return new WinningChecker();
    }

    public Map<String, Integer> checkWinners(Users users, List<Integer> resultData, List<Line> bridgeStates) {
        int[] position = new int[users.getNumberOfUsers()];
        for (int i = 0; i < position.length; i += 1) {
            position[i] = i;
        }

        for (Line state : bridgeStates) {
            swapPositionInLine(position, state);
        }

        Map<String, Integer> resultPosition = new HashMap<>();
        for (int i = 0; i < position.length; i += 1) {
            String userName = users.get(i).getName();
            Integer winning = resultData.get(findIndex(position, i));

            resultPosition.put(userName, winning);
        }

        return resultPosition;
    }

    private void swapPositionInLine(int[] position, Line state) {
        for (int j = 0; j < state.size(); j += 1) {
            swapPosition(state, position, j);
        }
    }

    private void swapPosition(Line state, int[] position, int index) {
        if (state.get(index)) {
            int tempt = position[index];
            position[index] = position[index + 1];
            position[index + 1] = tempt;
        }
    }

    private int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
