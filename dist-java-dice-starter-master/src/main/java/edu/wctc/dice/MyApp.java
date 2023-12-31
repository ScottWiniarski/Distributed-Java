package edu.wctc.dice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((DiceGame)context.getBean("diceGame")).play();

        // These three lines do the same thing as the previous line.
        Object o = context.getBean("diceGame");
        DiceGame d = (DiceGame)o;
        d.play();
    }
}
