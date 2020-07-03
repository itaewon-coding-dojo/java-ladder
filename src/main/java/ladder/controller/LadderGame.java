package ladder.controller;

import ladder.domain.BridgeGenerator;
import ladder.domain.Users;
import ladder.domain.UsersNameReader;
import ladder.view.Input;
import ladder.view.Output;

import java.util.List;

public class LadderGame {
    public static void main(String[] args) {
        UsersNameReader usersNameReader = Input.getUsersName();
        Users users = usersNameReader.convertNamesToUsers();

        int time = Input.getHeightOfLadder();
        BridgeGenerator bridgeGenerator = BridgeGenerator.newInstance(users.getNumberOfUsers(), time);

        bridgeGenerator.add(List.of(true, false, true));
        bridgeGenerator.add(List.of(false, true, false));
        bridgeGenerator.add(List.of(true, false, false));
        bridgeGenerator.add(List.of(false, true, false));
        bridgeGenerator.add(List.of(true, false, true));

        Output.showUserNames(users);
        Output.showResult(bridgeGenerator.getBridgeStates());
    }
}
