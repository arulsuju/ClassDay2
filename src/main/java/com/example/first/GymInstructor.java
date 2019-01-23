package com.example.first;

public class GymInstructor implements Instructor {
    public String getInfo() {
        return "I am GYm trainer";
    }

    public int getExp() {
        return 5;
    }

    public String skillSets() {
        return "Gym Training, weight Loss";
    }

    public String getFees() {
        return "20,000 per month";
    }

    public String getFortune() {
        return null;
    }
}
