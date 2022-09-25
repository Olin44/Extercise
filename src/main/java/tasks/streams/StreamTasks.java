package tasks.streams;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("user")
abstract class StreamTasks {
    abstract List<String> filterDistinctString(List<String> notDistinctStrings);

    abstract List<Integer> reverseOrder(List<Integer> integers);

    abstract List<String> dnaToListOfTriplets(String dna);

    abstract List<Integer> removeGreaterThanProvidedMaxNumber(List<Integer> integers, int maxNumber);
}
