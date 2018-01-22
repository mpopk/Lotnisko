package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private final List<String> tasks = new ArrayList<>();


    public List<String> getTasks() {
        return tasks;
    }

    public void addTasks(String task) {
        tasks.add(task);
    }
}

