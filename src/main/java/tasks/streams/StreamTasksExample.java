package tasks.streams;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Component
@Profile("example")
class StreamTasksExample extends StreamTasks {
    @Override
    List<String> filterDistinctString(List<String> notDistinctStrings) {
        return notDistinctStrings.stream()
                .distinct()
                .toList();
    }

    @Override
    List<Integer> reverseOrder(List<Integer> integers) {
        return integers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    @Override
    List<String> dnaToListOfTriplets(String dna) {
        return Arrays.stream(dna.split("(?<=\\G.{3})"))
                .map(String::toUpperCase)
                .toList();
    }

    @Override
    List<Integer> removeGreaterThanProvidedMaxNumber(List<Integer> integers, int maxNumber) {
        return integers.stream()
                .filter(integer -> integer < maxNumber)
                .toList();
    }
}
