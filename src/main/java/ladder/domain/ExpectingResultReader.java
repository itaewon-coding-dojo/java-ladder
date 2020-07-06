package ladder.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpectingResultReader {
    private final String result;

    public ExpectingResultReader(String result) {
        this.result = result;
    }

    public static ExpectingResultReader newInstance(String result) {
        return new ExpectingResultReader(result);
    }

    public List<Integer> convertToResultData() {
        return Arrays.stream(this.result.replaceAll("꽝", "0").split(",")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        String[] results = this.result.split(",");

        return String.join("   ", results);
    }
}
