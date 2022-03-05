package com.procoding.springdemo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService)
    {
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "Spend 30 min on batting pitch";
    }

    @Override
    public String getDailyFortune() {
        //use my fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
