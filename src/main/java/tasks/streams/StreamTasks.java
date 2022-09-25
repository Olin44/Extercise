package tasks.streams;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

public interface StreamTasks {
    List<String> filterDistinctString(List<String> notDistinctStrings);

    List<Integer> reverseOrder(List<Integer> integers);

    List<String> dnaToListOfTriplets(String dna);

    List<Integer> removeGreaterThanProvidedMaxNumber(List<Integer> integers, int maxNumber);
}
