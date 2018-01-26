package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User john = new Millenials("John Smith");
        User steven = new ZGeneration("Steven Carrington");
        User anna = new YGeneration("Anna Taylor");

        //When
        String johnShouldUse = john.publish();
        System.out.println("John should use: " + johnShouldUse);
        String stevenShouldUse = steven.publish();
        System.out.println("Steven should use: " + stevenShouldUse);
        String annaShouldUse = anna.publish();
        System.out.println("Anna should use: " + annaShouldUse);

        //Then
        Assert.assertEquals("[Facebook Publisher] post on Facebook", johnShouldUse);
        Assert.assertEquals("[Snapchat Publisher] post on Snapchat", stevenShouldUse);
        Assert.assertEquals("[Twitter Publisher] post on Twitter", annaShouldUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Smith");

        //When
        String johnShouldUse = john.publish();
        System.out.println("John should: " + johnShouldUse);
        john.setSocialPublisher(new FacebookPublisher());
        johnShouldUse = john.publish();
        System.out.println("John should: " + johnShouldUse);
    }
}

