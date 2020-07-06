package ladder.view;

import ladder.domain.Line;
import ladder.domain.Users;
import ladder.domain.Winners;

import java.util.List;

public class Output {
    public static void showUserNames(Users users) {
        System.out.println(users.toString());
    }

    public static void showResult(List<Line> bridgeStates) {
        bridgeStates.forEach(v -> System.out.println(v.toString()));
    }

    public static void showWinners(Winners winners) {
        System.out.println("");
        winners.getWinners().forEach((key, value) -> {
            if (value == 0) {
                System.out.printf("%s: %s\n", key, "꽝");
            }
            System.out.printf("%s: %d\n", key, value);
        });
    }

    public static void showExpecting(String data) {
        System.out.println(data);
    }
}
