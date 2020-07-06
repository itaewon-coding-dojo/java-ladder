package ladder.domain;

import java.util.List;

public class WinnerDTO {
    private Users users;
    private List<Integer> resultData;
    private List<Line> bridgeStates;

    public static WinnerDTO newInstance() {
        return new WinnerDTO();
    }

    public void add(Users users, List<Integer> resultData, List<Line> bridgeStates) {
        this.users = users;
        this.resultData = resultData;
        this.bridgeStates = bridgeStates;
    }

    public Users getUsers() {
        return this.users;
    }

    public List<Integer> getResultData() {
        return this.resultData;
    }

    public List<Line> getBridgeStates() {
        return this.bridgeStates;
    }
}
