package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void gutestFactoryShoppingTask() {
//Given

        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.doTask(TaskFactory.SHOPPINGTASK);

        //Then
        Assert.assertEquals("Buy fruits", shoppingTask.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {

        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.doTask(TaskFactory.PAINTINGTASK);

        //Then
        Assert.assertEquals("Paint the room", paintingTask.getTaskName());

    }

    @Test
    public void testFactoryDrivingTask() {
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.doTask(TaskFactory.DRIVINGTASK);

        //Then

        Assert.assertEquals("Drive ahead", drivingTask.getTaskName());

    }

}
