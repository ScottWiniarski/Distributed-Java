package edu.wctc.dice.impl;


import edu.wctc.dice.iface.GameOutput;
import org.springframework.stereotype.Component;

@Component
public class ConsoleOutput implements GameOutput {
    public void getOutput(String text) {
        System.out.println(text);
    }
}
