package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPINGTASK = "ShoppingTask";
    public static final String PAINTINGTASK = "PaintingTask";
    public static final String DRIVINGTASK = "DrivingTask";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy fruits", "Buy apples", 10);
            case PAINTINGTASK:
                return new PaintingTask("Paint the room", "Black", "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Drive ahead", "Gdansk", "Car");
            default:
                return null;
        }
    }
}