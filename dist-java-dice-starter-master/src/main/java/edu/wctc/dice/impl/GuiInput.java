package edu.wctc.dice.impl;

import edu.wctc.dice.iface.GameInput;

import javax.swing.*;

public class GuiInput implements GameInput {
    @Override
    public String getInput(String prompt) {
       return JOptionPane.showInputDialog(prompt);
    }
}
