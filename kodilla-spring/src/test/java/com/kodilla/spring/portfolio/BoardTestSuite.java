package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

@Test
public void testTaskAddToDo(){
    //Given
    ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
    Board board = context.getBean(Board.class);
    //When
    board.getToDoList().addTasks("Task 1");
    board.getToDoList().addTasks("Task 1a");
    board.getToDoList().addTasks("Task 1b");

    //Then
    board.readToDoList();
}

    @Test
    public void testTaskAddInProgress(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When

        board.getInProgressList().addTasks("Task 1");
        board.getInProgressList().addTasks("Task 2");
//Then
        board.readInProgressList();
    }

    @Test
    public void testTaskAddDone(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When

        board.getDoneList().addTasks("Task 5");
        board.getDoneList().addTasks("Task 8");
        //Then
        board.readDoneList();
    }

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTasks("Task 10");
        board.getInProgressList().addTasks("Task 7");
        board.getDoneList().addTasks("Task 6");

        //Then
        board.readToDoList();

        board.readInProgressList();

        board.readDoneList();
    }
}