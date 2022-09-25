package tasks.streams;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

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
}
