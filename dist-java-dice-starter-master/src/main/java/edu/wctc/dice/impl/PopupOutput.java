package edu.wctc.dice.impl;

import edu.wctc.dice.iface.GameOutput;
import org.springframework.stereotype.Component;

import javax.swing.*;


public class PopupOutput implements GameOutput {

    @Override
    public void getOutput(String text){
        JOptionPane.showMessageDialog(null, text);
    }
}
