package ladder.controller;

import ladder.domain.*;
import ladder.view.Input;
import ladder.view.Output;

public class LadderGame {
    public static void main(String[] args) {
        UsersNameReader usersNameReader = Input.getUsersName();
        Users users = usersNameReader.convertNamesToUsers();

        ExpectingResultReader expectingResultReader =
                ExpectingResultReader.newInstance(Input.getExectingResult());

        PartsOfLadder partsOfLadder = PartsOfLadder.newInstance(users.getNumberOfUsers(), Input.getHeightOfLadder());
        BridgeGenerator bridgeGenerator = BridgeGenerator.newInstance(partsOfLadder);

        bridgeGenerator.create();

        WinningChecker winningChecker = WinningChecker.newInstance();

        Output.showUserNames(users);
        Output.showResult(bridgeGenerator.getBridgeStates());
        Output.showExpecting(expectingResultReader.toString());
        Output.showWinners(winningChecker.checkWinners(users, expectingResultReader.convertToResultData(), bridgeGenerator.getBridgeStates()));
    }
}
