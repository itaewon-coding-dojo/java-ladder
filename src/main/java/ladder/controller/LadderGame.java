package ladder.controller;

import ladder.domain.Users;
import ladder.domain.UsersNameReader;
import ladder.view.Input;

public class LadderGame {
    public static void main(String[] args) {
        UsersNameReader usersNameReader = Input.getUsersName();
        Users users = usersNameReader.convertNamesToUsers();

    }
}
