package sk.sovy.kincel.springdemoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeDemoApp {
    public static void main(String[] args) {
        Coach coach = new BaseballTraining();
        BaseballTraining baseballTraining = new BaseballTraining();
        System.out.println(baseballTraining.getDailyWorkout());
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        theCoach = context.getBean("myCricketCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        context.close();

    }

}
