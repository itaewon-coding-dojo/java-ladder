package ladder.controller;

import ladder.domain.*;
import ladder.view.Input;
import ladder.view.Output;

import java.util.Map;

public class LadderGame {
    public static void main(String[] args) {
        UsersNameReader usersNameReader = Input.getUsersName();
        Users users = usersNameReader.convertNamesToUsers();

        ExpectingResultReader expectingResultReader =
                ExpectingResultReader.newInstance(Input.getExectingResult());

        LadderMaterial ladderMaterial = LadderMaterial.newInstance(users.getNumberOfUsers(), Input.getHeightOfLadder());
        BridgeGenerator bridgeGenerator = BridgeGenerator.newInstance(ladderMaterial);
        bridgeGenerator.create();

        WinnerDTO winnerDto = WinnerDTO.newInstance();
        winnerDto.add(users, expectingResultReader.convertToResultData(), bridgeGenerator.getBridgeStates());

        WinningChecker winningChecker = WinningChecker.newInstance();
        Map<String, Integer> winners = winningChecker.checkWinners(winnerDto);

        Output.showUserNames(users);
        Output.showResult(bridgeGenerator.getBridgeStates());
        Output.showExpecting(expectingResultReader.toString());
        Output.showWinners(winners);
    }
}
