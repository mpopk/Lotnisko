package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testNewBigMac() {

        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .ingredient("cheese")
                .ingredient("chilli")
                .roll("Sesame roll")
                .sauce("BigMac sauce")
                .burgers(3)
                .ingredient("lettuce")
                .build();
        System.out.println(bigMac);

        //When
        int howManyIngredients = bigMac.getIngredients().size();

        //Then
        Assert.assertEquals(3, howManyIngredients);

    }
}
