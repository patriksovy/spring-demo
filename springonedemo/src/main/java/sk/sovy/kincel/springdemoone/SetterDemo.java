package sk.sovy.kincel.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("apllicationContext.xml");

        CricketTraining theCoach = context.getBean("myCricketTraining", CricketTraining.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAddress());

        System.out.println(theCoach.getTeam());
    }
}
