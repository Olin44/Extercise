package tasks.streams;

import java.util.List;

interface StreamTasks {

    List<String> filterDistinctString(List<String> notDistinctStrings);

    List<Integer> reverseOrder(List<Integer> integers);

    List<String> dnaToListOfTriplets(String dna);

    List<Integer> removeGreaterThanProvidedMaxNumber(List<Integer> integers, int maxNumber);

}
