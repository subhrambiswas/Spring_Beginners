package com.procoding.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String args[]){

        //load the spring confriguration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/procoding/configurationfiles/beanscope-applicationContext.xml");

        //retrieve  bean from the container

        Coach thecoach = context.getBean("myCoach", Coach.class);
        Coach alphacoach = context.getBean("myCoach", Coach.class);



    }
}
