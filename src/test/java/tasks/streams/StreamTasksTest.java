package tasks.streams;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StreamTasksTest {

    @Autowired
    StreamTasks streamTasks;

    @Test
    void name() {
        streamTasks.filterDistinctString(List.of());
    }
}