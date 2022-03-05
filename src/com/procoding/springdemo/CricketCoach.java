package com.procoding.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    private  String emailAddress;
    private String team;

    //create a no-arg constructor
    public CricketCoach(){
        System.out.println("Cricket Coach - no arg constructor");


    }

    //our setter and getter methods
    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("CricketCoach:inside setter methods");
        this.fortuneService=fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach:inside setter methods to set email address");
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach:inside setter methods to set team");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Fast bowling for 20 mins";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
