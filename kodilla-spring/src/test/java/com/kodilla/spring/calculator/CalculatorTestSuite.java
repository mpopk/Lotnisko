package com.kodilla.spring.library;

import com.kodilla.spring.calculator.Calculator;
import com.kodilla.spring.calculator.Display;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void addAToB() {
        //Given

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When

        double sum = calculator.add(2.2, 2.3);

        //Then

        Assert.assertEquals(4.5, sum, 0);
    }


    @Test
    public void subAFromB() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sub = calculator.add(1.5, 1.4);
        //Then
        Assert.assertEquals(2.9, sub, 0);
    }

    @Test
    public void mulAByB() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double mul = calculator.mul(2.0, 2.0);
        //Then
        Assert.assertEquals(4.0, mul, 0);
    }
        @Test
        public void divAByB() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Calculator calculator = context.getBean(Calculator.class);
            //When
            double div = calculator.div(6.0, 1.5);
            //Then
            Assert.assertEquals(4.0, div, 0);

        }
    }



