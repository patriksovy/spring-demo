package sk.sovy.kincel.springdemoone;

public class TrackTraining implements Coach{
    private FortuneTeller fortuneTeller;

    public TrackTraining(){

    }

    public TrackTraining(FortuneTeller fortuneTeller){
        this.fortuneTeller=fortuneTeller;
    }

    @Override
    public String getDailyWorkout(){
        return "5km run";
    }

    @Override
    public String getDailyFortune() {
        return fortuneTeller.getDailyFortune();
    }

    public void StartupStuff(){
        System.out.println("TrackTraining: inside method StartupStuff");
    }

    public void DestroyStuff(){
        System.out.println("TrackTraining: inside method DestroyStuff");
    }
}
