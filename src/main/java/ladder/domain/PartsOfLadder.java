package ladder.domain;

public class PartsOfLadder {
    private final int numberOfUsers;
    private final int heigthOfLadder;

    public PartsOfLadder(int numberOfUsers, int heigthOfLadder) {
        this.numberOfUsers = numberOfUsers;
        this.heigthOfLadder = heigthOfLadder;
    }

    public static PartsOfLadder newInstance(int numberOfUsers, int heigthOfLadder) {
        return new PartsOfLadder(numberOfUsers, heigthOfLadder);
    }

    public int getNumberOfUsers() {
        return this.numberOfUsers;
    }

    public int getHeigthOfLadder() {
        return this.heigthOfLadder;
    }
}
