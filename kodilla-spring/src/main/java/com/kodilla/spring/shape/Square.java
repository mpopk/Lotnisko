package com.kodilla.spring.shape;


import org.springframework.context.annotation.Bean;

import java.util.Random;

public class Square implements Shape {
        @Override
        public String getShapeName() {
            return "This is a square.";
        }

        @Bean
        public Shape choosenShape() {
            Shape theShape;
            Random generator = new Random();
            int choosen = generator.nextInt(3);
            if (choosen == 0) {
                theShape = new Triangle();
            } else if (choosen == 1) {
                theShape = new Circle();
            } else {
                theShape = new Square();
            }
            return theShape;
        }
    }

