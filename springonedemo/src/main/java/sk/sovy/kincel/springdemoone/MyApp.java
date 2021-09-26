package sk.sovy.kincel.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        Coach coach = new BaseballTraining();
        BaseballTraining baseballTraining = new BaseballTraining();
        System.out.println(baseballTraining.getDailyWorkout());
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        theCoach = context.getBean("myCricketCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        context.close();
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = theCoach == alphaCoach;

        System.out.println("Pointing to the same object" + result);

        System.out.println("Memory location for theCoach: " + theCoach);

        System.out.println("Memory location for theCoach: " + alphaCoach);

        context.close();
    }

}
