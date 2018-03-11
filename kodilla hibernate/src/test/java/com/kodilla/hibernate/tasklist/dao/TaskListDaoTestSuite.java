package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {


        @Autowired
        private TaskListDao taskListDao;
        private static final String LISTNAME = "Lista  1";


        @Test
        public void TaskListDaoFindByListName() {
            //Given
            TaskList taskList = new TaskList(2, LISTNAME, "Kodilla" );
            taskListDao.save(taskList);
            String listName = taskList.getListName();

            //When
            List<TaskList> readTaskLists = taskListDao.findByListName(listName);

            //Then
            Assert.assertEquals(2, readTaskLists.size());

            //CleanUp
            //int id = readTasks.get(0).getId();
            //taskDao.delete(id);
        }

    }

