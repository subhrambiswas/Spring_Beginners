package com.procoding.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String args[]) {

        //load the spring configuration file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/procoding/configurationfiles/applicationContext.xml");

        //retrieve bean from spring container
        CricketCoach thecoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(thecoach.getDailyWorkout());
        System.out.println(thecoach.getDailyFortune());

        //call new methods to call literal methods
        System.out.println(thecoach.getEmailAddress());
        System.out.println(thecoach.getTeam());


        //close the context
        context.close();
    }
}
