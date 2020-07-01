package ladder.view;

import ladder.domain.UsersNameReader;

import java.util.Scanner;

public class Input {
    public static UsersNameReader getPlayersName() {
        System.out.println("참여할 사람의 이름을 입력하세요. 이름은 쉼표(,)로 구분합니다");
        Scanner scanner = new Scanner(System.in);

        return UsersNameReader.from(scanner.nextLine());
    }
}
