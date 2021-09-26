package sk.sovy.kincel.springdemoone;

public class FootballCoach implements Coach{
    private FortuneTeller fortuneTeller1;

    @Override
    public String getDailyWorkout() {
        return "Kick the ball around 5 times.";
    }
    @Override
    public String getDailyFortune() {
        return null;
    }

    public FootballCoach(FortuneTeller fortuneTeller2){
        fortuneTeller1=fortuneTeller2;
    }
}
