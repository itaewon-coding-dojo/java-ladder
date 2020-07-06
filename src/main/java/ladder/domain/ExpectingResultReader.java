package ladder.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpectingResultReader {
    private final String result;

    public ExpectingResultReader(String result) {
        this.result = result.replaceAll("꽝", "0");
    }

    public static ExpectingResultReader newInstance(String result) {
        return new ExpectingResultReader(result);
    }

    public List<Integer> convertToResultData() {
        return Arrays.stream(this.result.split(",")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    }
}
