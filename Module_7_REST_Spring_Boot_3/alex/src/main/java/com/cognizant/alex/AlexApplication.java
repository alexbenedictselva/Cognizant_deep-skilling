package com.cognizant.alex;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AlexApplication {

    public static void main(String[] args) {

        displayDate();

    }

    public static void displayDate() {

        // Load Spring XML Configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        // Retrieve the bean
        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);

        try {

            // Parse the String into Date object
            Date date = format.parse("31/12/2018");

            // Print the Date
            System.out.println(date);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}