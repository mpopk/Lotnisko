package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;

    private TaskList inProgressList;

    private TaskList doneList;

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void readToDoList() {
        System.out.println("Tasks to do: " + toDoList.getTasks());
    }

    public void readInProgressList() {
        System.out.println("Tasks in progress: " + inProgressList.getTasks());
    }

    public void readDoneList() {
        System.out.println("Completed tasks: " + doneList.getTasks());
    }

}

