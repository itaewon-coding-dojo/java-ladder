package ladder.view;

import ladder.domain.UsersNameReader;

import java.util.Scanner;

public class Input {
    public static UsersNameReader getUsersName() {
        System.out.println("참여할 사람의 이름을 입력하세요. 이름은 쉼표(,)로 구분합니다");
        Scanner scanner = new Scanner(System.in);

        return UsersNameReader.newInstace(scanner.nextLine());
    }

    public static String getExecutionResult() {
        System.out.println("실행 결과를 입력하세요. 이름은 쉼표(,)로 구분합니다");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static int getHeightOfLadder() {
        System.out.println("최대 사다리 높이는 몇 개 인가요?");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
