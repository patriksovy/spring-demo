package sk.sovy.kincel.springdemoone;

public class BaseballCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
