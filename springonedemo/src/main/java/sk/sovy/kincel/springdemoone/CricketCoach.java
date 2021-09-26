package sk.sovy.kincel.springdemoone;


public class CricketTraining implements Coach{
    private FortuneTeller fortuneTeller;

    private String emailAddress;
    private String team;

    public CricketTraining(){
        System.out.println("CricketTraining ; contructor");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketTraining ; Inside setter method -myEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketTraining ; Inside setter method -myTeam");
        this.team = team;
    }

    public void setFortuneTeller(FortuneTeller fortuneTeller) {
        this.fortuneTeller = fortuneTeller;
    }

    @Override
    public String getDailyWorkout() {
        return "Training";
    }

    @Override
    public String getDailyFortune() {
        return fortuneTeller.getDailyFortune();
    }
}
