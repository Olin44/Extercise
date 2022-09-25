package tasks.streams;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("user")
class StreamTasksUser implements StreamTasks {
    @Override
    public List<String> filterDistinctString(List<String> notDistinctStrings) {
        return null;
    }

    @Override
    public List<Integer> reverseOrder(List<Integer> notDistinctStrings) {
        return null;
    }
}
