package ladder.domain;

public class LadderMaterial {
    private final int numberOfUsers;
    private final int heigthOfLadder;

    public LadderMaterial(int numberOfUsers, int heigthOfLadder) {
        this.numberOfUsers = numberOfUsers;
        this.heigthOfLadder = heigthOfLadder;
    }

    public static LadderMaterial newInstance(int numberOfUsers, int heigthOfLadder) {
        return new LadderMaterial(numberOfUsers, heigthOfLadder);
    }

    public int getNumberOfUsers() {
        return this.numberOfUsers;
    }

    public int getHeigthOfLadder() {
        return this.heigthOfLadder;
    }
}
