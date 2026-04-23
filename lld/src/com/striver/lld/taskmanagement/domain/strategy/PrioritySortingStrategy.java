package com.striver.lld.taskmanagement.domain.strategy;

import com.striver.lld.taskmanagement.domain.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrioritySortingStrategy implements TaskSortingStrategy{

    @Override
    public List<Task> sort(List<Task> tasks) {
        // TODO: Implement priority-based sorting (URGENT -> HIGH -> MEDIUM -> LOW)
        List<Task> mutableTasks = new ArrayList<>(tasks);
        mutableTasks.sort(Comparator.comparing(Task::getPriority,
                (p1, p2) -> p2.ordinal() - p1.ordinal())); // Higher priority first
        return mutableTasks;
    }

    @Override
    public String getStrategyName() {
        return "PRIORITY";
    }
}
