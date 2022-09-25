package tasks.streams;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StreamTasksTest {

    @Autowired
    StreamTasks streamTasks;

    @ParameterizedTest
    @MethodSource("argumentsForShouldReturnDistinctStrings")
    void shouldReturnDistinctStrings(List<String> notDistinctStrings, List<String> distinctStrings) {
        //when
        List<String> providedDistinctString = streamTasks.filterDistinctString(notDistinctStrings);
        //then
        assertEquals(providedDistinctString, distinctStrings);
    }

    private static Stream<Arguments> argumentsForShouldReturnDistinctStrings() {
        return Stream.of(
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of("first"), List.of("first")),
                Arguments.of(List.of("first", "first", "first"), List.of("first")),
                Arguments.of(List.of("first", "second", "first"), List.of("first", "second")),
                Arguments.of(List.of("first", "second", "first", "second"), List.of("first", "second")),
                Arguments.of(List.of("first", "second", "first", "second"), List.of("first", "second"))
        );
    }
}