package ladder;

import ladder.domain.ExpectingResultReader;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ExpectingResultReaderTest {
    @Test
    void convertToResultData() {
        ExpectingResultReader reader = ExpectingResultReader.newInstance("꽝,3000,꽝,5000");

        List<Integer> resultData = List.of(0, 3000, 0, 5000);

        assertThat(reader.convertToResultData()).isEqualTo(resultData);
    }
}
