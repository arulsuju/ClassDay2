package com.example.first;

public class ComputerInstructor implements Instructor {

    private FortuneService fortuneService;

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Method Dependency Injection");
        this.fortuneService = fortuneService;
    }

    public ComputerInstructor() {
    }

    /*Constructor Dependency Injection
    public ComputerInstructor(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public String getInfo() {
        return "I am the computer teacher with 6 years of experience";
    }

    public int getExp() {
        return 6;
    }

    public String skillSets() {
        return "JAVA,Spring and spring boot";
    }

    public String getFees() {
        return "30,000 per Month";
    }

    public String getFortune() {
        return fortuneService.discount();
    }

    public void init(){
        System.out.println("Init method called");
    }
    public void  destroy(){
        System.out.println("Destroy");
    }
}
