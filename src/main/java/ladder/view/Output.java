package ladder.view;

import ladder.domain.Line;
import ladder.domain.Users;

import java.util.List;

public class Output {
    public static void showUserNames(Users users) {
        System.out.println(users.toString());
    }

    public static void showResult(List<Line> bridgeStates) {
        bridgeStates.forEach(v -> System.out.println(v.toString()));
    }
}
