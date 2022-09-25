package tasks.streams;

import java.util.List;

class StreamTasksExample implements StreamTasks {
    @Override
    public List<String> filterDistinctString(List<String> notDistinctStrings) {
        return notDistinctStrings.stream()
                .distinct()
                .toList();
    }
}
