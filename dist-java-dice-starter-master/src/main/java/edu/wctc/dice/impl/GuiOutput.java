package edu.wctc.dice.impl;

import edu.wctc.dice.iface.GameOutput;

import javax.swing.*;

public class GuiOutput implements GameOutput {
    @Override
    public void output(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
}
