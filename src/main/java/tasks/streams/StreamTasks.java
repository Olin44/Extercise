package tasks.streams;

import java.util.List;

interface StreamTasks {

    List<String> filterDistinctString(List<String> notDistinctStrings);

    List<Integer> reverseOrder(List<Integer> integers);

    String dnaToListOfTriplets(String dna);
}
