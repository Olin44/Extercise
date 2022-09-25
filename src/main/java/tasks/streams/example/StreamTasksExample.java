package tasks.streams.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import tasks.streams.StreamTasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Component
@Profile("example")
public class StreamTasksExample implements StreamTasks {
    @Override
    public List<String> filterDistinctString(List<String> notDistinctStrings) {
        return notDistinctStrings.stream()
                .distinct()
                .toList();
    }

    @Override
    public List<Integer> reverseOrder(List<Integer> integers) {
        return integers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    @Override
    public List<String> dnaToListOfTriplets(String dna) {
        return Arrays.stream(dna.split("(?<=\\G.{3})"))
                .map(String::toUpperCase)
                .toList();
    }

    @Override
    public List<Integer> removeGreaterThanProvidedMaxNumber(List<Integer> integers, int maxNumber) {
        return integers.stream()
                .filter(integer -> integer <= maxNumber)
                .toList();
    }
}
