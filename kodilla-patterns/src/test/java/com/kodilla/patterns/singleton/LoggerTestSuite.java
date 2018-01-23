package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logUser() {
        Logger.getInstance().log("Logging user");
    }


    @Test
    public void testGetLog() {
        //Given
        //When
        String log = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("Logging user", log);
    }

}
