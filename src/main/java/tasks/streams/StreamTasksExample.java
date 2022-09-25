package tasks.streams;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

@Component
@Profile("example")
class StreamTasksExample implements StreamTasks {
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
}
