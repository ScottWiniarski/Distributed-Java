package edu.wctc.dice.impl;


import edu.wctc.dice.iface.GameOutput;
import org.springframework.stereotype.Component;


public class ConsoleOutput implements GameOutput {
    public void output(String text) {
        System.out.println(text);
    }
}
