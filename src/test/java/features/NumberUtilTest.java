package features;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class NumberUtilTest {
    @Test
    @DisplayName("Test if the generator create unique 3 digit number")
    void generateAnswer() {
        List<Integer> result = NumberUtil.generateAnswer();
        Set<Integer> unique = new HashSet<>(result);
        assertAll(
                () -> assertThat(result).as("Number has to be 3 digits").hasSize(3),
                () -> assertThat(result).as("Number cannot be null").isNotNull(),
                () -> assertThat(unique).as("Number has to be unique").hasSize(3),
                () -> assertThat(result).as("Number cannot have 0").doesNotContain(0));
    }

    @Test
    @DisplayName("Test converter not changing any data")
    void convertString() {
        String input = "123";
        List<Integer> actual = NumberUtil.convertString(input);
        List<Integer> expected = Arrays.asList(1,2,3);
        assertThat(actual).isEqualTo(expected);
    }
}
