package ladder.domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WinningChecker {
    public static WinningChecker newInstance() {
        return new WinningChecker();
    }

    public Map<String, Integer> checkWinners(Users users, List<Integer> resultData, List<Line> bridgeStates) {
        int[] position = new int[] { 0, 1, 2 };
        for (Line state : bridgeStates) {
            for (int j = 0; j < state.size(); j += 1) {
                if (state.get(j)) {
                    swapPosition(position, j);
                }
            }
        }

        Map<String, Integer> resultPosition = new HashMap<>();
        for (int i = 0; i < position.length; i += 1) {
            resultPosition.put(users.get(i).getName(), findIndex(position, i));
        }

        return resultPosition;
    }

    private int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    private void swapPosition(int[] position, int index) {
        int tempt = position[index];
        position[index] = position[index + 1];
        position[index + 1] = tempt;
    }
}
