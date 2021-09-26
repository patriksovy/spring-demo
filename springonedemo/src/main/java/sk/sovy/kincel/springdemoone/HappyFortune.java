package sk.sovy.kincel.springdemoone;

public class HappyFortune implements FortuneTeller{
    @Override
    public String getDailyFortune() {
        return "Today is your day :)";
    }
}
