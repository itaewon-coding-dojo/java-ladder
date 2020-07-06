package ladder.controller;

import ladder.domain.BridgeGenerator;
import ladder.domain.Users;
import ladder.domain.UsersNameReader;
import ladder.view.Input;
import ladder.view.Output;

public class LadderGame {
    public static void main(String[] args) {
        UsersNameReader usersNameReader = Input.getUsersName();
        Users users = usersNameReader.convertNamesToUsers();

        String expectingResult = Input.getExectingResult();

        BridgeGenerator bridgeGenerator =
                BridgeGenerator.newInstance(users.getNumberOfUsers(), Input.getHeightOfLadder());

        bridgeGenerator.create();

        Output.showUserNames(users);
        Output.showResult(bridgeGenerator.getBridgeStates());
    }
}
